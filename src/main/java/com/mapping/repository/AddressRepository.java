package com.mapping.repository;

import com.mapping.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>
{
//    public Address findById(int i);
    public Address findByCity(String city);
}
