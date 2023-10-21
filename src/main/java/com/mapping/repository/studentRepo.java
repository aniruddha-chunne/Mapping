package com.mapping.repository;

import com.mapping.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<Student, Integer>
{
}
