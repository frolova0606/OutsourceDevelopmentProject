package org.frolova.outsource.example.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime startDate;

    private String technologicalStack;

    @ManyToOne
    @JoinColumn(name = "TEAM")
    private Team team;

    @OneToOne
    @JoinColumn(name = "CONTRACT")
    private Contract contract;
}
