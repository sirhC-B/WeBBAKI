package de.thb.webbakilogin.web;

import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.web.dao.UserLoginDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class UserLoginController {

    private UserService userService;

    @ModelAttribute("user")
    public UserLoginDao userLoginDto(){
        return new UserLoginDao();
    }

    @GetMapping
    public String showLoginForm(){
        return "login";
    }

    @PostMapping
    public String loginUser(@ModelAttribute("user") UserLoginDao userLoginDao){
        userService.save(userLoginDao);
        return "redirect:login?success";
    }
}
