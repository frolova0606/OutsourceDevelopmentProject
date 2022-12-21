package org.frolova.outsource.example.repository;

import org.frolova.outsource.example.model.ExecutorCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutorCompanyRepository extends JpaRepository<ExecutorCompany, Long> {
}
