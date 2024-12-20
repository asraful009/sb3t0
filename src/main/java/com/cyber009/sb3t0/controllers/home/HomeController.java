package com.cyber009.sb3t0.controllers.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("name", "World");
        return "index";
    }
}
