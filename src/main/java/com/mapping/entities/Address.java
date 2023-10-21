package com.mapping.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Transactional
@Data
//@NoArgsConstructor
@Table(name = "employee_AddRESS")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String city;
    private String addressType;

//    @ManyToOne
//    @JoinColumn(name = "One")
//    private Employee employee;

    public Address() {
    }

    public Address(Long addressId, String city, String addressType) {
        this.addressId = addressId;
        this.city = city;
        this.addressType = addressType;

    }


    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

}
