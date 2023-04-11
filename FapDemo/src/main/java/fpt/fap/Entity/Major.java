/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.fap.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author seoao
 */
@Entity
@Table(name = "Major")
public class Major {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MajorID", nullable = false)
    private int MajorID;
    
    @Column(name = "Majortitle")
    private String MajorTitle;

    public Major() {
    }

    public Major(int MajorID, String MajorTitle) {
        this.MajorID = MajorID;
        this.MajorTitle = MajorTitle;
    }

    public int getMajorID() {
        return MajorID;
    }

    public void setMajorID(int MajorID) {
        this.MajorID = MajorID;
    }

    public String getMajorTitle() {
        return MajorTitle;
    }

    public void setMajorTitle(String MajorTitle) {
        this.MajorTitle = MajorTitle;
    }
    
    
}
