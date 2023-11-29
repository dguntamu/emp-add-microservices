package com.microservice.address.dao;

import com.microservice.address.entity.AddressEntity;

public interface AddressDAO {
    AddressEntity getAddress(Integer employeeId);
}
