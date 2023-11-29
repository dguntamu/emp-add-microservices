package com.microservice.address.repository;

import com.microservice.address.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity,Integer> {
    AddressEntity findByEmployeeId(Integer employeeId);
}
