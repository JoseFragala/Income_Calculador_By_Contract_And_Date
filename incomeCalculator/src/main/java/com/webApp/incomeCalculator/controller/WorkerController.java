package com.webApp.incomeCalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webApp.incomeCalculator.dto.WorkerIncomeDto;
import com.webApp.incomeCalculator.repositories.WorkerRepository;
import com.webApp.incomeCalculator.entities.Worker;

@RestController 
@RequestMapping (value = "/workers")
public class WorkerController {

    @Autowired 
    private WorkerRepository workerRepository;

    @GetMapping (value = "/{id}/income/{year}/{month}")
    public WorkerIncomeDto getIncome(
        @PathVariable Long id,
        @PathVariable Integer year,
        @PathVariable Integer month){

        Worker worker = workerRepository.findById(id).get();

        return new WorkerIncomeDto(worker.getName(), worker.getDepartment().getName(), worker.income(year, month));



    }





    
}
