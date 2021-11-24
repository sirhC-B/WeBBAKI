package de.thb.webbakilogin.controller;

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

/**
 * Muss heute noch gebaut werden
 * Ist die Seite nach Login wo Schalenmodell und Bedrohungsmatrix implementiert sind
 */