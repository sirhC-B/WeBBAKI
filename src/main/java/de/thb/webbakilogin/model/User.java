package de.thb.webbakilogin.model;

import lombok.*;
import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    //Id Erstellung
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, length = 20)
    private String firstName;

    @Column(nullable = false, length = 20)
    private String lastName;

    @Column(nullable = false, length = 64)
    private String password;

    /**
     * @JoinTable benötigt für private Collection roles
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="user_roles",
            joinColumns = @JoinColumn(
                    name = "user_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id",referencedColumnName = "id")
    )

    private Collection<Role> roles;


    /**
     * Ersatz für @AllArgsConstructor, da sonst Probleme in der UserServiceImpl .save Methode
     * @param email
     * @param firstName
     * @param lastName
     * @param password
     * @param roles
     */
    public User(String email, String firstName, String lastName, String password, Collection<Role> roles){
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setPassword(password);
        setRoles(roles);
    }


    /**
     * TODO
     * Sektor noch benötigt
     * Siehe UserRegistrationDAO
     */
}