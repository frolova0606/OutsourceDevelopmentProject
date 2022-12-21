package org.frolova.outsource.example.repository;

import org.frolova.outsource.example.model.CustomerCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCompanyRepository extends JpaRepository<CustomerCompany, Long> {
}
