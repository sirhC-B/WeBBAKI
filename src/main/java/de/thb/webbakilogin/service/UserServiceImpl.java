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

    /***
     * Constructor of the UserServiceImpl class
     * @param userRepository TODO
     */
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /***
     * Creates an Instance of User with the parameters of registrationDao and persists it
     * @param registrationDao Instance, which holds all Registration inputs
     * @return Persist this user instance
     */
    @Override
    public User save(UserRegistrationDao registrationDao) {
        User user = new User(registrationDao.getFirstName(),
                registrationDao.getLastName(), registrationDao.getEmail(),
                registrationDao.getPassword(), List.of(new Role("ROLE_USER")));

        return userRepository.save(user);
    }

    /***
     * Creates an Instance of User with the parameters of userLoginDao and persists it
     * @param userLoginDao Instance, which holds all Login inputs
     * @return Persist this user instance
     */
    @Override
    public User save(UserLoginDao userLoginDao){
        User user = new User(userLoginDao.getEmail(), userLoginDao.getPassword(), List.of(new Role("ROLE_USER")));

        return userRepository.save(user);
    }
}
