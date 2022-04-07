package com.projeto.springprojetointegrador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import repository.Administrador;
import repository.AdministradorRepo;

@Controller
public class LoginController {
        @Autowired
        private AdministradorRepo repo;

    
    @GetMapping("/login")
    public String index(){
        return "login/index";
    }

    @PostMapping("/logar")
    public String logar(Model model, Administrador admParam, String Lembrar){
        
        return "login/index";
    }
}