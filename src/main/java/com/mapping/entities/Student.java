package com.mapping.entities;

import jakarta.persistence.*;

@Entity
@Table(name="jpa_student")
public class Student
{
    @Id
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne( cascade = CascadeType.ALL )
    @JoinColumn(name = "Join_StudentId_LaptopId")
    private Laptop laptop;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Student(int studentId, String studentName, String about) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", about='" + about + '\'' +
                ", laptop=" + laptop +
                '}';
    }

}
