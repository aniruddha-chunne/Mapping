package com.mapping.controller;

import com.mapping.entities.Address;
import com.mapping.entities.Employee;
import com.mapping.repository.AddressRepository;
import com.mapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeController
{
    @Autowired
    private EmployeeRepository empRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/saveEmployee")
    public ResponseEntity<String> saveEmployee(@RequestBody List<Employee> empData)
    {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data Saved");

    }

//    @PostMapping("/saveAddress")
//    public ResponseEntity<String> saveAddress(@RequestBody List<Address> addData)
//    {
//        addressRepository.saveAll(addData);
//        return ResponseEntity.ok("Data Saved");
//
//    }


//    @GetMapping("/Address")
//    public String getAddress()
//    {
//        List<Address> s =  addressRepository.findAll();
//
//        System.out.println(s.toString());
//
////        for(Address s: c)
////        {
////            System.out.println(s.getEmployee().toString());
////        }
//
//
//        return "get all";
//
//    }

}
