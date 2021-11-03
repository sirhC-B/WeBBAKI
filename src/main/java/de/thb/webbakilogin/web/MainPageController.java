package de.thb.webbakilogin.web;

import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.web.dao.UserLoginDao;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainPageController{

    /*
    Giving the Login Parameters for the Login Form in index.html
     */

    @ModelAttribute("logUser")
    public UserLoginDao userLoginDto(){
        return new UserLoginDao();
    }

    /*
    Giving the Register Parameters for the Register Form in index.html
     */
    @ModelAttribute("regUser")
    public UserRegistrationDao userRegistrationDao(){
        return new UserRegistrationDao();
    }

    @GetMapping
    public String showIndex(){
        return "index";
    }

    /***
     * TODO
     * @ return
     */

}
