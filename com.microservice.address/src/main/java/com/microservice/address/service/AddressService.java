package com.microservice.address.service;

import com.microservice.address.dto.AddressDTO;

public interface AddressService {
    AddressDTO getEmployeeAddress(Integer employeeId);
}
