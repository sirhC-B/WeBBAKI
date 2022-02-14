package de.thb.webbakilogin.controller;

import de.thb.webbakilogin.service.ScenarioService;
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
    public ScenarioService scenarioService;

    @GetMapping
    public String showStartPage(){
        return "startpage";
    }

    @ModelAttribute("scenario")
    public List<String> getSZ(){
        return scenarioService.getAllScenarios();
    }


    /**
     * Incremented Master Topics
     * @return
     */

    @ModelAttribute("masterTopic0")
    public List<String> getMasterZero(){
        return scenarioService.getAllMasterTopicsOne();
    }

    @ModelAttribute("masterTopic1")
    public List<String> getMasterOne(){
        return scenarioService.getAllMasterTopicsTwo();
    }

    @ModelAttribute("masterTopic2")
    public List<String> getMasterTwo(){
        return scenarioService.getAllMasterTopicsThree();
    }

    @ModelAttribute("masterTopic3")
    public List<String> getMasterThree(){
        return scenarioService.getAllMasterTopicsFour();
    }

    @ModelAttribute("masterTopic4")
    public List<String> getMasterFour(){
        return scenarioService.getAllMasterTopicsFive();
    }

    @ModelAttribute("masterTopic5")
    public List<String> getMasterFive(){
        return scenarioService.getAllMasterTopicsSix();
    }


}

/**
 * Muss heute noch gebaut werden
 * Ist die Seite nach Login wo Schalenmodell und Bedrohungsmatrix implementiert sind
 */