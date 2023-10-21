package com.mapping.entities;


import com.mapping.entities.Address;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


@Entity
//@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_DETAILS")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;

    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn(name="fk_Id", referencedColumnName = "emp_id")
    private Set<Address> address;


}
