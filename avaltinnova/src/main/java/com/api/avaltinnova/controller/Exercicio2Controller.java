package com.api.avaltinnova.controller;

import com.api.avaltinnova.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Exercício 2 - Algoritmo de Ordenação Bubble Sort
 * Vetor padrão informado para ser ordenado = {5, 3, 2, 4, 7, 1, 0, 6}
 * @return Vetor Ordenado
 */
@RestController
@RequestMapping("/exercicio2")
public class Exercicio2Controller {
    @Autowired
    ExerciciosService exerciciosService;

    @GetMapping("/ordenarVetor")
    public Integer[] ordenacaoBubbleSort(@RequestParam Integer[] vetor) {
        return exerciciosService.ordenarVetor(vetor);
    }
}
