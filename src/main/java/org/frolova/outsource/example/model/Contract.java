package org.frolova.outsource.example.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@ToString(exclude = {"customer", "executor"})
@EqualsAndHashCode(exclude = {"customer", "executor"})
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Contract {
    @Id
    @GeneratedValue
    private Long id;

    private String objective;

    private LocalDateTime expireDate;

    private BigDecimal price;

    @OneToOne(mappedBy = "contract")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customerCompany", nullable = false)
    private CustomerCompany customer;

    @ManyToOne
    @JoinColumn(name = "executorCompany")
    private ExecutorCompany executor;
}
