package com.api.avaltinnova.controller;
import com.api.avaltinnova.dto.Exercicio1DTO;
import com.api.avaltinnova.dto.Exercicio2DTO;
import com.api.avaltinnova.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Nesta classe contém todos os endpoints necessários para os exercícios de 1 a 4.
 * @author Eduardo
 */
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
    @GetMapping("/1")
    public ResponseEntity<List<Exercicio1DTO>>buscaPercentuais(){
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
    @GetMapping("/2")
    public ResponseEntity<List<Exercicio2DTO>> buscaVetorOrdenado(){
        return ResponseEntity.status(HttpStatus.OK).body(exerciciosService.ordenaVetorBubbleSort());
    }

    /**
     * Exercício 3 - Fatorial
     * @param numero Número informado pelo usuário.
     * @return Fatorial do número informado.
     */
    @GetMapping("/3")
    public String calcularFatorial(@RequestParam Integer numero) {
        return exerciciosService.calcularFatorial(numero);
    }

    /**
     * Exercício 4 - Somar Múltiplos
     * @param numero Número informado pelo usuário.
     * @return Soma dos múltiplos a partir do número informado pelo usuário.
     */
    @GetMapping("/4")
    public Integer somaMultiplos(@RequestParam Integer numero) {
        return exerciciosService.somarMultiplos(numero);
    }
}
