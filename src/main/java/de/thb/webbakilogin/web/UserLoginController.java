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

    /***
     * TODO
     * @return
     */
    @ModelAttribute("user")
    public UserLoginDao userLoginDao(){
        return new UserLoginDao();
    }

    @GetMapping
    public String showLoginForm(){
        return "login";
    }

    /***
     * Calls method for handling persistence of UserLoginDao instances, with userLoginDao
     * Additionally redirects webpage user
     * @param userLoginDao Instance, which holds all Login inputs
     * @return redirects to the webpage for a successful login
     */
    @PostMapping
    public String loginUser(@ModelAttribute("user") UserLoginDao userLoginDao){
        userService.save(userLoginDao);
        return "redirect:login?success";
    }
}
