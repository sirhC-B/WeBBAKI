package de.thb.webbakilogin.entity;

import de.thb.webbakilogin.entity.Role;
import lombok.Getter;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privileges", fetch = FetchType.EAGER)
    private Collection<Role> roles;

    public Privilege(String name) {
        this.name = name;
    }

    public Privilege(){
    }
}


