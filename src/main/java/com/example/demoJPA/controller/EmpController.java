package com.example.demoJPA.controller;

import com.example.demoJPA.entity.Emp;
import com.example.demoJPA.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping("/saveemp")
    public Boolean saveEmp(@RequestBody Emp emp) {
        return empService.add(emp);
    }

    @GetMapping("/getall")
    public Iterable<Emp> findAll(){
        return empService.getAll();
    }

    @GetMapping("/getempbyname")
    public List<Emp> findEmpByName(@RequestParam String name){
        return empService.getEmpByName(name);
    }

    @GetMapping("/getempbysalary")
    public List<Emp> findEmpBySalary(@RequestParam Double salary){
        return empService.getEmpBySalary(salary);
    }
}
