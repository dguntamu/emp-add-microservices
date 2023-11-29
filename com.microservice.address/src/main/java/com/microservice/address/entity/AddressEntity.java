package com.microservice.address.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer addressId;
    @Column(name = "lane_1")
    private String lane1;
    @Column(name = "lane_2")
    private String lane2;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "emp_id")
    private Integer employeeId;
}
