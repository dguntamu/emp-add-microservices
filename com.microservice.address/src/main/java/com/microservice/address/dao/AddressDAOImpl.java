package com.microservice.address.dao;

import com.microservice.address.entity.AddressEntity;
import com.microservice.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDAOImpl implements AddressDAO{

    @Autowired
    private AddressRepository addressRepository;
    @Override
    public AddressEntity getAddress(Integer employeeId) {
        return addressRepository.findByEmployeeId(employeeId);
    }
}
