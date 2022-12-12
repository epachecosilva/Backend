package com.api.avaltinnova.controller;

import com.api.avaltinnova.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio4")
public class Exercicio4Controller {
    @Autowired
    ExerciciosService exerciciosService;

    @GetMapping("/calcularSomaMultiplos")
    public Integer calcularSomaMultiplos(@RequestParam Integer numero) {
        return exerciciosService.somarMultiplos(numero);
    }
}
