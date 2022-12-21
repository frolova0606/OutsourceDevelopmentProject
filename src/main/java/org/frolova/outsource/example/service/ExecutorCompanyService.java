package org.frolova.outsource.example.service;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.dto.CompanyDto;
import org.frolova.outsource.example.model.ExecutorCompany;
import org.frolova.outsource.example.repository.ExecutorCompanyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ExecutorCompanyService {
    private final ExecutorCompanyRepository repository;

    public ExecutorCompany getCompanyById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public void createCompany(CompanyDto companyDto) {
        ExecutorCompany company = ExecutorCompany.builder()
                .name(companyDto.getName())
                .address(companyDto.getAddress())
                .inn(companyDto.getInn())
                .ogrn(companyDto.getOgrn())
                .build();
        repository.save(company);
    }
}
