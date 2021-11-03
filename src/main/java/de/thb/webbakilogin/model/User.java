package de.thb.webbakilogin.model;

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;

import java.util.List;

@NoArgsConstructor
@Entity
@Table(name = "users")
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
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




    /***
     * Constructor for User Login, uses inputs from Login
     * @param email
     * @param password
     * @param roles
     */

    /***
     * Constructor for User Registration, uses inputs from Registration
     * @param firstName
     * @param lastName
     * @param email
     * @param password
     * @param roles
     */
}