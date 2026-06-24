/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.biblioteca.controller;

import ch.qos.logback.core.model.Model;
import com.main.biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Aluno
 */
@Controller
public class LivroController {
    
    @Autowired
    
    LivroRepository  repo;
    @GetMapping("/")
    public String buscarLivroPorId(Model model){
        
        
    }
    
    */
}
