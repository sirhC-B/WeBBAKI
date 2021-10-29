package de.thb.webbakilogin.web;

import de.thb.webbakilogin.web.dao.UserLoginDao;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainPageController{

    public String index(){
        return "Spring Boot Example";
    }
}
