package de.thb.webbakilogin.service;

import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
