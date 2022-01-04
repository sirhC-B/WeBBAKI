package de.thb.webbakilogin.controller;

import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.controller.dao.UserLoginDao;
import de.thb.webbakilogin.controller.dao.UserRegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class MainPageController{

    @Autowired
    private UserService userService;
    /*
    Giving the Login Parameters for the Login Form in index.html
     */



    @ModelAttribute("logUser")
    public UserLoginDao userLoginDto(Model model){
        model.addAttribute("logUser", new UserLoginDao());
        return new UserLoginDao();
    }

    /*
    Giving the Register Parameters for the Register Form in index.html
     */

    @ModelAttribute("user")
    public UserRegistrationDao userRegistrationDao(){
        return new UserRegistrationDao();
    }

    @GetMapping
    public String showIndex(){
        return "login";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/register")
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDao registrationDao){
        userService.save(registrationDao);
        return "redirect:login/?success";
    }

}
