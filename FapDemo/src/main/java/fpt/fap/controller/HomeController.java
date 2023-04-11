/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.fap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author seoao
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String openHomePage(){
        System.out.println("Go to home page");
        return "Home";
    }
}
