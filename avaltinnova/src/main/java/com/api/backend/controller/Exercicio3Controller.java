package com.api.backend.controller;

import com.api.backend.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio3")
public class Exercicio3Controller {
    @Autowired
    ExerciciosService exerciciosService;

    @GetMapping("/calcularFatorial")
    public String calcularFatorial(@RequestParam Integer numero) {
        return exerciciosService.calcularFatorial(numero);
    }
}
