package com.api.avaltinnova.service;
import com.api.avaltinnova.dto.Exercicio1DTO;
import com.api.avaltinnova.dto.Exercicio2DTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public String calcularFatorial(Integer numero) {
        String fatorial = numero + "! = ";
        int f = 1;
        if (numero >= 2) {
            for (int i = 1; i <= numero; i++) {
                f *= i;
                if (i != numero) {
                    fatorial += i + " x ";
                } else {
                    fatorial += i;
                }
            }
            fatorial += " = " + f;
        } else {
            fatorial += f;
        }
        return fatorial;
    }

    public Integer somarMultiplos(Integer numero) {
        int soma = 0;
        List<Integer> multiplos = new ArrayList<Integer>();

        for(int i = 0; i < numero; i++) {
            if(i % 5 == 0 || i % 3 == 0) {
                multiplos.add(i);
            }
        }
        if(multiplos.size() > 0) {
            for(int i = 0; i < multiplos.size(); i++) {
                soma += multiplos.get(i);
            }
        }
        return soma;
    }
}
