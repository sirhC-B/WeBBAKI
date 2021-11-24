package de.thb.webbakilogin.service;

import de.thb.webbakilogin.model.Role;
import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.repository.UserRepository;
import de.thb.webbakilogin.controller.dao.UserLoginDao;
import de.thb.webbakilogin.controller.dao.UserRegistrationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDao registrationDao) {
        User user = new User(registrationDao.getEmail(),registrationDao.getFirstName(),registrationDao.getLastName(),
                passwordEncoder.encode(registrationDao.getPassword()    ), Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);
    }

    @Override
    public User save(UserLoginDao userLoginDao) {
        return null;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userRepository.findByEmail(username);
       if(user == null){
           throw new UsernameNotFoundException("Falsche Email oder Passwort.");

       }
       return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthoroties(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthoroties(Collection<Role> roles){

        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

    }
}
