package counter.app.web;

import counter.app.repositories.CountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private final CountRepository countRepository;

    @Autowired
    public HomeController(CountRepository countRepository) {
        this.countRepository = countRepository;
    }

    @GetMapping("/")
    String test() {
        return "index";
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