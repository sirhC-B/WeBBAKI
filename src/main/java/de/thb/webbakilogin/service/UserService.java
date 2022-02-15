package de.thb.webbakilogin.service;

import de.thb.webbakilogin.controller.dao.UserLoginDao;
import de.thb.webbakilogin.controller.dao.UserRegistrationDao;
import de.thb.webbakilogin.entity.Role;
import de.thb.webbakilogin.entity.User;
import de.thb.webbakilogin.repository.RoleRepository;
import de.thb.webbakilogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public User registerNewUser(UserRegistrationDao registrationDao) {
        User user = new User(registrationDao.getEmail(),registrationDao.getFirstName(),registrationDao.getLastName(),
                passwordEncoder.encode(registrationDao.getPassword() ), registrationDao.getRole(), registrationDao.isEnabled());

        //TODO Default role for now, has to be changed in the near future
        Role role = roleRepository.findByName("ROLE_ADMIN");
        user.setRole(role);

        return userRepository.save(user);
    }

    public User registerNewUser(UserLoginDao userLoginDao) {
        return null;
    }

}
