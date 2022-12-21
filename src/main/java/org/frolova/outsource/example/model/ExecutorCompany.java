package org.frolova.outsource.example.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ExecutorCompany extends Company {
    @OneToMany(mappedBy = "executor")
    private List<Contract> contracts;
}
