package de.thb.webbakilogin.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Role(){

    }
    public Role(String name) {
        this.name = name;
    }
/***
     * Constructor of the Role Class
     * @param name the name of the role
     */

}
