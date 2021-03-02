package counter.app.web;

import counter.app.entities.Count;
import counter.app.repositories.CountRepository;
import counter.app.services.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
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
        this.countService.increment();
        return this.countRepository.getOne(1L).toString();
//        return "index";
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