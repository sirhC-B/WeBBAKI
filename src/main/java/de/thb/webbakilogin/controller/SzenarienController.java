package de.thb.webbakilogin.controller;


import de.thb.webbakilogin.controller.dao.UserLoginDao;
import de.thb.webbakilogin.service.SzenarioServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class SzenarienController {

    @Autowired
    public SzenarioServiceImpl szenarioService;


    @GetMapping(path = "getdata")
    public List<String> getSZ(){
        return szenarioService.szenarioGetAllSzena();
    }

}
