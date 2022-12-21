package org.frolova.outsource.example.controller;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.dto.CompanyDto;
import org.frolova.outsource.example.model.CustomerCompany;
import org.frolova.outsource.example.service.CustomerCompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customerCompany")
public class CustomerCompanyController {
    private final CustomerCompanyService service;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerCompany> getCompanyById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.getCompanyById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public void createCompany(@RequestBody CompanyDto companyDto) {

    }
}
