package de.thb.webbakilogin.service;

import de.thb.webbakilogin.repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenarioService  {

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

    public List<String> getAllMasterTopicsOne(){
        return scenarioRepository.getAllMastertopicsOne();
    }

    public List<String> getAllMasterTopicsTwo(){
        return scenarioRepository.getAllMastertopicsTwo();
    }

    public List<String> getAllMasterTopicsThree(){
        return scenarioRepository.getAllMastertopicsThree();
    }

    public List<String> getAllMasterTopicsFour(){
        return scenarioRepository.getAllMastertopicsFour();
    }

    public List<String> getAllMasterTopicsFive(){
        return scenarioRepository.getAllMastertopicsFive();
    }

    public List<String> getAllMasterTopicsSix(){
        return scenarioRepository.getAllMastertopicsSix();
    }


    public List<String> getAllSubtopics(){
        return scenarioRepository.getAllSubtopics();
    }


}
