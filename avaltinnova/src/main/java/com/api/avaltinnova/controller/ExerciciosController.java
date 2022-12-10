package com.api.avaltinnova.controller;

import com.api.avaltinnova.dto.Exercicio1DTO;
import com.api.avaltinnova.dto.Exercicio2DTO;
import com.api.avaltinnova.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/exercicios")
public class ExerciciosController {

    @Autowired
    ExerciciosService exerciciosService;

    /**
     * Exercício 1 - Listar os dados mencionados e calcular os Percentuais
     * para cada categoria: Votos Válidos, Nulos e em Branco.
     * @return JSON com as informações passadas como padrão e percentuais para
     * cada método.
     */
    @GetMapping(value = "/1")
    public ResponseEntity<List<Exercicio1DTO>>getPercentuais(){
        return ResponseEntity.status(HttpStatus.OK).body(exerciciosService.calculaPerc());
    }
    /**
     * Exercício 2 - Algoritmo de Ordenação Bubble Sort
     * Vetor informado para ser ordenado = {5, 3, 2, 4, 7, 1, 0, 6}
     * @return JSON com os seguintes atributos:
     * Vetor Original = {5, 3, 2, 4, 7, 1, 0, 6}
     * Vetor Ordenado = {0, 1, 2, 3, 4, 5, 6, 7}
     * Variável Auxi e Contador.
     */
    @GetMapping(value = "/2")
    public ResponseEntity<List<Exercicio2DTO>> getVetorOrdenado(){
        return ResponseEntity.status(HttpStatus.OK).body(exerciciosService.ordenaVetorBubbleSort());
    }


}
