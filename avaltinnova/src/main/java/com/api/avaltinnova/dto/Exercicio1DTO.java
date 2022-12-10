package com.api.avaltinnova.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercicio1DTO {
    private int totalEleitores = 1000;
    private int validos = 800;
    private int votosBrancos = 150;
    private int nulos = 50;
    private double percVotosValidos;
    private double percVotosNulos;
    private double percVotosBrancos;

    public Double calculaVotosValidos(Integer totalEleitores, Integer validos){
        double percVotosValidos = (validos * 100) / totalEleitores;
        return percVotosValidos;
    }
    public Double calculaVotosNulos(Integer totalEleitores, Integer nulos){
        double percVotosNulos = (nulos * 100) / totalEleitores;
        return percVotosNulos;
    }
    public Double calculaVotosBrancos(Integer totalEleitores, Integer votosBrancos){
        double percVotosBrancos = (votosBrancos * 100) / totalEleitores;
        return percVotosBrancos;
    }
}
