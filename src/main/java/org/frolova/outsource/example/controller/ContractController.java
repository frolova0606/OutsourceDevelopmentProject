package org.frolova.outsource.example.controller;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.dto.ContractDto;
import org.frolova.outsource.example.model.Contract;
import org.frolova.outsource.example.service.ContractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contract")
public class ContractController {
    private final ContractService service;

    @GetMapping("/{id}")
    public ResponseEntity<Contract> getContractById(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(service.getContractById(id), HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public void createContract(@RequestBody ContractDto contractDto) {
        service.createContract(contractDto);
    }
}
