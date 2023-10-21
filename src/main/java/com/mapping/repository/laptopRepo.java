package com.mapping.repository;

import com.mapping.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface laptopRepo extends JpaRepository<Laptop, Integer>
{
}
