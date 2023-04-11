/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.fap.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author seoao
 */
@Entity
@Table(name = "Student")
public class Student {
    
    @Id
    @Column(name = "StudentID", length = 10, nullable = false)
    private String StudentID;
    
    @Column(name = "StudentName", length = 100)
    private String StudentName;
    
    @Column(name = "StudentEmail", length = 100)
    private String StudentEmail;
    
    @Column(name = "DOB")
    private Date DOB;
    
    @Column(name = "Gender")
    private boolean Gender;
    
    @Column(name = "Address", length = 200)
    private String Address;
    
    @Column(name = "MajorID")
    private int MajorID;

    public Student() {
    }

    public Student(String StudentID, String StudentName, String StudentEmail, Date DOB, boolean Gender, String Address, int MajorID) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.StudentEmail = StudentEmail;
        this.DOB = DOB;
        this.Gender = Gender;
        this.Address = Address;
        this.MajorID = MajorID;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String StudentEmail) {
        this.StudentEmail = StudentEmail;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getMajorID() {
        return MajorID;
    }

    public void setMajorID(int MajorID) {
        this.MajorID = MajorID;
    }
    
    
}
