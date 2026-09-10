package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/")
    public String mensagem(){
        return "Bem-Vindo";
    }

    @GetMapping("/dev")
    public String nomeDev() {
        return "KING NÃO FUME";
    }

    @GetMapping("/curso")
    public String nomeCurso(){
        return "Desenvolvimento de Sistemas.";
    }

}

