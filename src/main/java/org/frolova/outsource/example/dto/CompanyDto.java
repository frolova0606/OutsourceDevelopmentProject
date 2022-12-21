package org.frolova.outsource.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDto {
    private String name;

    private Long inn;

    private Long ogrn;

    private String address;
}
