package de.thb.webbakilogin.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "privileges")
    private List<Role> roles;

    public Privilege(String name) {
        this.name = name;
    }

    public Privilege(){
    }
}


