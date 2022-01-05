package de.thb.webbakilogin.controller;

import de.thb.webbakilogin.service.SzenarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


    /**
     * Incremented Master Topics
     * @return
     */

    @ModelAttribute("mastertopic0")
    public List<String> getMasterZero(){
        return szenarioService.getAllMastertopicsOne();
    }

    @ModelAttribute("mastertopic1")
    public List<String> getMasterOne(){
        return szenarioService.getAllMastertopicsTwo();
    }

    @ModelAttribute("mastertopic2")
    public List<String> getMasterTwo(){
        return szenarioService.getAllMastertopicsThree();
    }

    @ModelAttribute("mastertopic3")
    public List<String> getMasterThree(){
        return szenarioService.getAllMastertopicsFour();
    }

    @ModelAttribute("mastertopic4")
    public List<String> getMasterFour(){
        return szenarioService.getAllMastertopicsFive();
    }

    @ModelAttribute("mastertopic5")
    public List<String> getMasterFive(){
        return szenarioService.getAllMastertopicsSix();
    }


}

/**
 * Muss heute noch gebaut werden
 * Ist die Seite nach Login wo Schalenmodell und Bedrohungsmatrix implementiert sind
 */