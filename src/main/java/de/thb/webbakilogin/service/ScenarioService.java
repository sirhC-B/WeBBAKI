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
        return scenarioRepository.getAllMasterTopicsOne();
    }

    public List<String> getAllMasterTopicsTwo(){
        return scenarioRepository.getAllMasterTopicsTwo();
    }

    public List<String> getAllMasterTopicsThree(){
        return scenarioRepository.getAllMasterTopicsThree();
    }

    public List<String> getAllMasterTopicsFour(){
        return scenarioRepository.getAllMasterTopicsFour();
    }

    public List<String> getAllMasterTopicsFive(){
        return scenarioRepository.getAllMasterTopicsFive();
    }

    public List<String> getAllMasterTopicsSix(){
        return scenarioRepository.getAllMasterTopicsSix();
    }


    public List<String> getAllSubtopics(){
        return scenarioRepository.getAllSubtopics();
    }


}
