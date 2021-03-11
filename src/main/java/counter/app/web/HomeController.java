package counter.app.web;

import counter.app.entities.Count;
import counter.app.repositories.CountRepository;
import counter.app.services.CountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;

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
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("index");

        Count count = new Count(1L, 0);

        if (!this.countService.getCountById(1L).isPresent()) {
            this.countRepository.saveAndFlush(count);
        }
        this.countService.increment();

        modelAndView.addObject("count", formatNumber(this.countService.getCountById(1L).get().getCount()));
        return modelAndView;
    }

    private String formatNumber(Long num) {

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        return decimalFormat.format(num);
    }
}