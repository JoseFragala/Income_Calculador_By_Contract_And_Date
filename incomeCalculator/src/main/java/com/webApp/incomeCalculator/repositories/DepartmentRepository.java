package com.webApp.incomeCalculator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webApp.incomeCalculator.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    
}
