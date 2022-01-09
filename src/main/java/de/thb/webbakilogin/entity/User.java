package de.thb.webbakilogin.entity;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    //Id Erstellung
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 20)
    private String lastName;

    @Column(nullable = false, length = 64)
    private String password;

    @ColumnDefault("true")
    private boolean isEnabled = true;

    /*
    /**
     * @JoinTable benötigt für private Collection roles
     /
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="user_roles",
            joinColumns = @JoinColumn(
                    name = "user_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id",referencedColumnName = "id")
    )
    */
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


    /**
     * Ersatz für @AllArgsConstructor, da sonst Probleme in der UserServiceImpl .save Methode
     * @param email
     * @param firstName
     * @param lastName
     * @param password
     * @param role
     * @param isEnabled
     */
    public User(String email, String firstName, String lastName, String password, Role role, boolean isEnabled){
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setPassword(password);
        setRole(role);
        setEnabled(true);
    }


    /**
     * TODO
     * Sektor noch benötigt
     * Siehe UserRegistrationDAO
     */
}