package de.thb.webbakilogin.service;

import de.thb.webbakilogin.repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenarioService /*implements SzenarioService*/ {

    @Autowired
    private ScenarioRepository scenarioRepository;
    
    public List<String> getAllScenarios(){
        return scenarioRepository.findAllNames();
    }

    public List<String> getAllMasterTopics(){

        return scenarioRepository.findAllMasterTopics();
    }

    /**
     * Six methods @Override from SzenarioService
     * @return
     */

    public List<String> getAllMastertopicsOne(){
        return scenarioRepository.getAllMastertopicsOne();
    }

    public List<String> getAllMastertopicsTwo(){
        return scenarioRepository.getAllMastertopicsTwo();
    }

    public List<String> getAllMastertopicsThree(){
        return scenarioRepository.getAllMastertopicsThree();
    }

    public List<String> getAllMastertopicsFour(){
        return scenarioRepository.getAllMastertopicsFour();
    }

    public List<String> getAllMastertopicsFive(){
        return scenarioRepository.getAllMastertopicsFive();
    }

    public List<String> getAllMastertopicsSix(){
        return scenarioRepository.getAllMastertopicsSix();
    }


    public List<String> getAllSubtopics(){
        return scenarioRepository.getAllSubtopics();
    }


}
