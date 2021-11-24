package de.thb.webbakilogin.service;

import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.controller.dao.UserLoginDao;
import de.thb.webbakilogin.controller.dao.UserRegistrationDao;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDao registrationDao);
    User save(UserLoginDao userLoginDao);
}
