package org.frolova.outsource.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TeamMember {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String surname;

    private String position;

    @ManyToOne
    @JoinColumn(name = "TEAM")
    private Team team;
}
