package com.webApp.incomeCalculator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webApp.incomeCalculator.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    
}
