package org.frolova.outsource.example.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class ContractDto {
    private String objective;

    private LocalDateTime expireDate;

    private BigDecimal price;

    private Long customerId;
}
