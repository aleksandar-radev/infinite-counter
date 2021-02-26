package counter.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

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