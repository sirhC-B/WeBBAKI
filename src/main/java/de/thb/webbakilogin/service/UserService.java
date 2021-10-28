package de.thb.webbakilogin.service;

import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.web.dao.UserLoginDao;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;

public interface UserService {
    User save(UserRegistrationDao registrationDto);
    User save(UserLoginDao userLoginDao);
}
