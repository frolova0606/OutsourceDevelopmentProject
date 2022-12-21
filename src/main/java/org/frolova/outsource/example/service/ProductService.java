package org.frolova.outsource.example.service;

import lombok.RequiredArgsConstructor;
import org.frolova.outsource.example.model.Product;
import org.frolova.outsource.example.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Product getProductById(Long id) {
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
