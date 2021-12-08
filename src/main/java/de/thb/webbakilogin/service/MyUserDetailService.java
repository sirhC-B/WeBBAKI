package de.thb.webbakilogin.service;

import de.thb.webbakilogin.entity.Role;
import de.thb.webbakilogin.entity.User;
import de.thb.webbakilogin.model.Privilege;
import de.thb.webbakilogin.repository.RoleRepository;
import de.thb.webbakilogin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service("userDetailsService")
@Transactional
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String email) {

        User user = userRepository.findByEmail(email);

        //Depends on what we want the Role of non signed up Users to be
        if (user == null) {
            return new org.springframework.security.core.userdetails.User(
                    " ", " ", true, true, true, true,
                    getAuthorities(roleRepository.findByName("ROLE_USER")));
        }

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword() , user.isEnabled(), true, true,
                true, getAuthorities(user.getRole()));
    }



    private Collection<? extends GrantedAuthority> getAuthorities(Role role) {

        return getGrantedAuthorities(getPrivileges(role));
    }


    private List<String> getPrivileges(Role role) {

        List<String> privileges = new ArrayList<>();
        List<Privilege> collection = new ArrayList<>();

            privileges.add(role.getName());
            collection.addAll(role.getPrivileges());

        for (Privilege item : collection) {
            privileges.add(item.getName());
        }
        return privileges;
    }


    private List<GrantedAuthority> getGrantedAuthorities(List<String> privileges) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }
}
