package com.microservice.address.service;

import com.microservice.address.dao.AddressDAO;
import com.microservice.address.dto.AddressDTO;
import com.microservice.address.entity.AddressEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDAO addressDAO;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AddressDTO getEmployeeAddress(Integer employeeId) {
        AddressEntity addressEntity = addressDAO.getAddress(employeeId);
        return modelMapper.map(addressEntity, AddressDTO.class);
    }
}
