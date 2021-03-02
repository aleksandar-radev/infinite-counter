package counter.app.web;

import counter.app.entities.Count;
import counter.app.repositories.CountRepository;
import counter.app.services.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    public String test() {

        Count count = new Count(1L, 0);
        if (!this.countService.getCountById(1L).isPresent()) {
            this.countRepository.saveAndFlush(count);
        }
        this.countService.increment();

        return this.countService.getCountById(1L).get().toString();
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