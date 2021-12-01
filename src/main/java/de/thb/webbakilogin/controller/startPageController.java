package de.thb.webbakilogin.controller;

import de.thb.webbakilogin.service.SzenarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/start")
public class startPageController {

    @Autowired
    public SzenarioServiceImpl szenarioService;

    @GetMapping
    public String showStartPage(){
        return "startpage";
    }

    @ModelAttribute("szenario")
    public List<String> getSZ(){
        return szenarioService.szenarioGetAllSzena();
    }

}

/**
 * Muss heute noch gebaut werden
 * Ist die Seite nach Login wo Schalenmodell und Bedrohungsmatrix implementiert sind
 */