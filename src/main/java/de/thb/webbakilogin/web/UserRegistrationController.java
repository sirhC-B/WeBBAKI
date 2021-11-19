package de.thb.webbakilogin.web;

import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.web.servlet.headers.HttpPublicKeyPinningDsl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    @Autowired
    private UserService userService;

    public UserRegistrationController(UserService userService){
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDao userRegistrationDao(){
        return new UserRegistrationDao();
    }


    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    /***
     * Calls method for handling persistence of UserRegistrationDao instances, with registrationDao
     * Additionally redirects webpage user
     * @param registrationDao Instance, which holds all Registration inputs
     * @return redirects to the webpage for a successful registration
     */
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDao registrationDao){
        userService.save(registrationDao);
        return "redirect:registration?success";
    }


}
