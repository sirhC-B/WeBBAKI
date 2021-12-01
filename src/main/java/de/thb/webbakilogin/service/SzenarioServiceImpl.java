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



}
