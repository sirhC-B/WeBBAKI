package de.thb.webbakilogin.service;

import de.thb.webbakilogin.controller.dao.UserLoginDao;
import de.thb.webbakilogin.controller.dao.UserRegistrationDao;
import de.thb.webbakilogin.entity.User;
import de.thb.webbakilogin.model.Privilege;
import de.thb.webbakilogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.stream.Collectors;

@Transactional
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
                passwordEncoder.encode(registrationDao.getPassword() ), registrationDao.getRole());

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
       //mapRolesToAuthoroties(user.getRole())
       return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRole().getPrivileges()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Privilege> privileges){

        return privileges.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());

    }
}
