package de.thb.webbakilogin.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "scenario")
@Entity(name = "scenario" )
@NoArgsConstructor
@AllArgsConstructor
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = false)
    private boolean masterTopic;

    @Column(nullable = false, unique = false)
    private int tab_id;

}
