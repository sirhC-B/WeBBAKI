package de.thb.webbakilogin.web.dao;

import de.thb.webbakilogin.model.Role;
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
