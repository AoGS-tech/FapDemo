/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpt.fap.controller;

import fpt.fap.Entity.Account;
import fpt.fap.repository.AccountRepository;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author seoao
 */
@Controller
public class LoginController {
    
    @Autowired
    private AccountRepository accountRepository;
    
    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public String openLoginPage(){
        System.out.println("Go to login page");
        return "Login";
    }
    
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String checkLogin(@RequestParam String email, @RequestParam String password, HttpSession session, Model model){
        List<Account> accounts = accountRepository.findAll();
        for (Account account : accounts) {
            if(account.getEmail().equals(email) && account.getPassword().equals(password)){
                return "redirect:/home";
            }
        }
        model.addAttribute("message", "Email or password is invalid, please check again!");
        return "Login";
    }
}
