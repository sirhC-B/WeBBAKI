package de.thb.webbakilogin.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "szenarien")
@Entity(name = "szenarien" )
@NoArgsConstructor
@AllArgsConstructor
public class Szenarien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = false)
    private boolean mastertopic;

/***
 * Constructor of the Role Class
 * @param name the name of the role
 */

}
