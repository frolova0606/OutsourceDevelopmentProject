package org.frolova.outsource.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
@SuperBuilder
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Long inn;

    private Long ogrn;

    private String address;
}