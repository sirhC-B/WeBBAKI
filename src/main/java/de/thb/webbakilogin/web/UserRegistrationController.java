package de.thb.webbakilogin.web;

import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDao userRegistrationDto(){
        return new UserRegistrationDao();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDao registrationDto){
        userService.save(registrationDto);
        return "redirect:registration?success";
    }


}
