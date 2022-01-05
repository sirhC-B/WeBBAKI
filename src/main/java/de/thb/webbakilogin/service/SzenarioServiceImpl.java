package de.thb.webbakilogin.service;

import de.thb.webbakilogin.entity.Szenarien;
import de.thb.webbakilogin.repository.SzenarienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SzenarioServiceImpl implements SzenarioService {

    @Autowired
    private SzenarienRepository szenarienRepository;

    @Override
    public List<String> szenarioGetAllSzena(){
        return szenarienRepository.getAllSzena();
    }

    @Override
    public List<String> szenarioGetAllMaster(){

        return szenarienRepository.getAllMaster();
    }

    /**
     * Six methods @Override from SzenarioService
     * @return
     */

    public List<String> getAllMastertopicsOne(){
        return szenarienRepository.getAllMastertopicsOne();
    }

    public List<String> getAllMastertopicsTwo(){
        return szenarienRepository.getAllMastertopicsTwo();
    }

    public List<String> getAllMastertopicsThree(){
        return szenarienRepository.getAllMastertopicsThree();
    }

    public List<String> getAllMastertopicsFour(){
        return szenarienRepository.getAllMastertopicsFour();
    }

    public List<String> getAllMastertopicsFive(){
        return szenarienRepository.getAllMastertopicsFive();
    }

    public List<String> getAllMastertopicsSix(){
        return szenarienRepository.getAllMastertopicsSix();
    }


    @Override
    public List<String> szenarioGetAllSubs(){
        return szenarienRepository.getAllSubtopics();
    }


}
