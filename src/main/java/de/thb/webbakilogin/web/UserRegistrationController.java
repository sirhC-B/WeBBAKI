package de.thb.webbakilogin.web;

import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto(){
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto){
        userService.save(registrationDto);
        return "redirect:registration?success";
    }


}
