package org.frolova.outsource.example.service;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.dto.ContractDto;
import org.frolova.outsource.example.model.Contract;
import org.frolova.outsource.example.repository.ContractRepository;
import org.frolova.outsource.example.repository.CustomerCompanyRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;
    private final CustomerCompanyRepository customerCompanyRepository;

    public Contract getContractById(Long id) {
        return contractRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @Transactional
    public void createContract(ContractDto contractDto) {
        Contract contract = Contract.builder()
                .objective(contractDto.getObjective())
                .expireDate(contractDto.getExpireDate())
                .price(contractDto.getPrice())
                .customer(customerCompanyRepository.getOne(contractDto.getCustomerId()))
                .build();
        contractRepository.save(contract);
    }
}
