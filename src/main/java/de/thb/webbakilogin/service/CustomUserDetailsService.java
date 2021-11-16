package de.thb.webbakilogin.service;

import de.thb.webbakilogin.model.CustomUserDetails;
import de.thb.webbakilogin.model.User;
import de.thb.webbakilogin.model.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repo.findByEmail(email);
        if (user == null){
            throw new UsernameNotFoundException("User not Found");
        }
        return new CustomUserDetails(user);
    }
}
