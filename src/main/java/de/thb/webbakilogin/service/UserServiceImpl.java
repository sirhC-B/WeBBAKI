package de.thb.webbakilogin.service;

import de.thb.webbakilogin.model.Role;
import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.model.repository.UserRepository;
import de.thb.webbakilogin.web.dao.UserLoginDao;
import de.thb.webbakilogin.web.dao.UserRegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDao registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getEmail(),
                registrationDto.getPassword(), List.of(new Role("ROLE_USER")));

        return userRepository.save(user);
    }

    @Override
    public User save(UserLoginDao userLoginDao){
        User user = new User(userLoginDao.getEmail(), userLoginDao.getPassword(), List.of(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}
