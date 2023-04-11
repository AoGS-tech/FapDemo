/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.fap.repository;

import fpt.fap.Entity.Major;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author seoao
 */
public interface MajorRepository extends JpaRepository<Major, Integer>{
    
}
