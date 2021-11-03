package de.thb.webbakilogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/start")
public class startPageController {

    @GetMapping
    public String showStartPage(){
        return "startpage";
    }
}
