package counter.app.web;

import counter.app.repositories.CountRepository;
import counter.app.services.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private final CountRepository countRepository;
    private final CountService countService;

    @Autowired
    public HomeController(CountRepository countRepository, CountService countService) {
        this.countRepository = countRepository;
        this.countService = countService;
    }

    @GetMapping("/")
    String test() {

        return "index";
    }

    @GetMapping("/hell")
    String test2() {
        return "hell's kitchen";
    }




//    @PostMapping("/")
//    public ModelAndView regCon(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, ModelAndView modelAndView,
//                               HttpServletResponse httpServletResponse) {
//
//
//        System.out.println(1);
//        System.out.println();
//
//        return modelAndView;
//    }
}