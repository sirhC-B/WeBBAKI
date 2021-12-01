package de.thb.webbakilogin.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany (targetEntity=User.class, mappedBy="role")
    private List<User> users;

    /***
     * Constructor of the Role Class
     * @param name the name of the role
     */
    public Role (String name){
        this.name = name;
    }

    /***
     * One privilege can be part of multiple roles, while one role can consist of multiple privileges
     */
    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_id", referencedColumnName = "id"))
    private List<Privilege> privileges;
}
