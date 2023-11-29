package com.microservice.address.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AddressDTO {
    private Integer addressId;
    private String lane1;
    private String lane2;
    private String city;
    private String state;
    private Integer employeeId;
}
