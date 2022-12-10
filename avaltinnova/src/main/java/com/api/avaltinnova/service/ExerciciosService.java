package com.api.avaltinnova.service;

import com.api.avaltinnova.dto.Exercicio1DTO;
import com.api.avaltinnova.dto.Exercicio2DTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciciosService {

    public List<Exercicio1DTO> calculaPerc(){

        Exercicio1DTO exercicio1DTO = new Exercicio1DTO();

        Double percVotosValidos = exercicio1DTO.calculaVotosValidos(exercicio1DTO.getTotalEleitores(),
                exercicio1DTO.getValidos());
        exercicio1DTO.setPercVotosValidos(percVotosValidos);

        Double percVotosNulos = exercicio1DTO.calculaVotosNulos(exercicio1DTO.getTotalEleitores(),
                exercicio1DTO.getNulos());
        exercicio1DTO.setPercVotosNulos(percVotosNulos);

        Double percVotosBrancos = exercicio1DTO.calculaVotosBrancos(exercicio1DTO.getTotalEleitores(),
                exercicio1DTO.getVotosBrancos());
        exercicio1DTO.setPercVotosBrancos(percVotosBrancos);

        return List.of(exercicio1DTO);
    }
    public List<Exercicio2DTO> ordenaVetorBubbleSort(){

        Exercicio2DTO exercicio2DTO = new Exercicio2DTO();
        int[] vetorOrdenado = exercicio2DTO.ordenarVetor(exercicio2DTO.getVetorOrdenado());

        exercicio2DTO.setVetorOrdenado(vetorOrdenado);
        return List.of(exercicio2DTO);
    }
}
