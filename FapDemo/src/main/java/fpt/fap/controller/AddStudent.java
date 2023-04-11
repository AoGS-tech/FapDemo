/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.fap.controller;

import fpt.fap.Entity.Major;
import fpt.fap.repository.MajorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author seoao
 */
@Controller
public class AddStudent {
    
    @Autowired
    private MajorRepository majorRepository;
    
    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String openAddStudent(Model model){
        List<Major> majors = majorRepository.findAll();
        model.addAttribute("majors", majors);
        return "AddStudent";
    }
}
