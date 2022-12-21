package org.frolova.outsource.example.controller;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.model.ExecutorCompany;
import org.frolova.outsource.example.service.ExecutorCompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/executorCompany")
public class ExecutorCompanyController {
    private final ExecutorCompanyService service;

    @GetMapping("/{id}")
    public ResponseEntity<ExecutorCompany> getCompanyById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.getCompanyById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
}
