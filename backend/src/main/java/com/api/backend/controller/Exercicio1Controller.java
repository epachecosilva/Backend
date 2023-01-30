package com.api.backend.controller;

import com.api.backend.service.ExerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * Exercício 1 - Calcular os Percentuais
 * para cada categoria: Votos Válidos, Nulos e em Branco.
 * @return Percentual para cada categoria solicitada.
 */
@RestController
@RequestMapping("/exercicio1")
public class Exercicio1Controller {
    @Autowired
    ExerciciosService exerciciosService;

    @GetMapping("/votosValidos")
    public Integer percentualVotosValidos(@RequestParam Integer totalEleitores, @RequestParam Integer validos) {
        return exerciciosService.calculaVotosValidos(totalEleitores,validos);
    }

    @GetMapping("/votosNulos")
    public Integer percentualVotosNulos(@RequestParam Integer totalEleitores, @RequestParam Integer nulos) {
        return exerciciosService.calculaVotosNulos(totalEleitores,nulos);
    }
    @GetMapping("/votosBrancos")
    public Integer percentualVotosBrancos(@RequestParam Integer totalEleitores, @RequestParam Integer brancos) {
        return exerciciosService.calculaVotosBrancos(totalEleitores,brancos);
    }
}
