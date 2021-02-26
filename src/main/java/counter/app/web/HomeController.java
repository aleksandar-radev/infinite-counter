package counter.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String test() {
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