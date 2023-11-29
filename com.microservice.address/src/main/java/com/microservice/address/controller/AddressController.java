package com.microservice.address.controller;

import com.microservice.address.dto.AddressDTO;
import com.microservice.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    /*@GetMapping("/address/{empId}")
    public ResponseEntity<AddressDTO> getEmployeeAddress(@PathVariable("empId") Integer empId){
        return ResponseEntity.status(HttpStatus.OK).body(addressService.getEmployeeAddress(empId));
    }*/
    @GetMapping("/address/{empId}")
    public AddressDTO getEmployeeAddress(@PathVariable("empId") Integer empId){
        return addressService.getEmployeeAddress(empId);
    }
}
