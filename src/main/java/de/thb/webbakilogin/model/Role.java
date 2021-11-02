package de.thb.webbakilogin.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    /***
     * Constructor of the Role Class
     * @param name the name of the role
     */
    public Role (String name){
        this.name = name;
    }
}
