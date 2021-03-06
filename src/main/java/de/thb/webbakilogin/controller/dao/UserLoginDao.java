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
public class UserLoginDao {
    private String email;
    private String password;
    //Ziemlich unsicher hier
    private Role role;
}
