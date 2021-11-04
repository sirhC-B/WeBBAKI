package de.thb.webbakilogin.web;

import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.model.repository.UserRepository;
import de.thb.webbakilogin.service.UserService;
import de.thb.webbakilogin.web.dao.UserLoginDao;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class MainPageController{

    @Autowired
    private UserRepository repo;
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
    public UserRegistrationDao userRegistrationDao(Model model){
        model.addAttribute("regUser",new User());
        System.out.println("UNO!");
        return new UserRegistrationDao();
    }

    @GetMapping
    public String showIndex(){
        return "index";
    }

    @RequestMapping("/registrationSuccsess")
    public String registSuc(User user){
        repo.save(user);
        return "registration_success";

    }

    /***
     * TODO
     * @ return
     */

}
