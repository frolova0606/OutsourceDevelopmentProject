package org.frolova.outsource.example.service;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.dto.CompanyDto;
import org.frolova.outsource.example.model.Company;
import org.frolova.outsource.example.model.CustomerCompany;
import org.frolova.outsource.example.repository.CustomerCompanyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class CustomerCompanyService {
    private final CustomerCompanyRepository repository;

    public CustomerCompany getCompanyById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void createCompany(CompanyDto companyDto) {
        CustomerCompany company = CustomerCompany.builder()
                .name(companyDto.getName())
                .address(companyDto.getAddress())
                .inn(companyDto.getInn())
                .ogrn(companyDto.getOgrn())
                .build();
        repository.save(company);
    }
}
