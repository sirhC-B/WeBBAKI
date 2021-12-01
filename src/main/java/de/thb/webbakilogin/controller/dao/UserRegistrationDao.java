package de.thb.webbakilogin.controller.dao;

import de.thb.webbakilogin.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDao {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String sector;

    private Role role;

}
