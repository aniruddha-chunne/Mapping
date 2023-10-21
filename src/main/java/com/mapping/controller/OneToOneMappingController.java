package com.mapping.controller;

import com.mapping.entities.Laptop;
import com.mapping.entities.Student;
import com.mapping.repository.laptopRepo;
import com.mapping.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneToOneMappingController
{

    @Autowired
    private laptopRepo laptopRepo;

    @Autowired
    private studentRepo s;

    @GetMapping ("/onetoonemapping")
    public String onetoonemapping()
    {
        Student a = new Student(310,"Aniruddha", "JavaDeveloper");
        Laptop b = new Laptop(311, "T430", "Lenovo");

        laptopRepo.save(b);

//        b.setStudent(a);
        a.setLaptop(b);

//         laptopRepo.save(b);

        s.save(a);

         return "Saved";

    }

    @DeleteMapping("/demap")
        public String deleteLaptop()
        {
            s.deleteById(20);

//            laptopRepo.deleteById(311);
            return "deleted";
        }



}
