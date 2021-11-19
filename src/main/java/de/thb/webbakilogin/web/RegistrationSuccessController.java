package de.thb.webbakilogin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration_success")
public class RegistrationSuccessController {

    @GetMapping
    public String showStartPage(){
        return "registration_success";
    }
}