package com.api.backend.service;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExerciciosService {
    /**
     * Exercício 1 - Método que calcula percentual de Votos Válidos.
     * @param totalEleitores
     * @param validos
     * @return
     */
    public Integer calculaVotosValidos(Integer totalEleitores, Integer validos){
        return (validos * 100) / totalEleitores;
    }
    /**
     * Exercício 1 - Método que calcula percentual de Votos Nulos.
     * @param totalEleitores
     * @param nulos
     * @return
     */
    public Integer calculaVotosNulos(Integer totalEleitores, Integer nulos){
        return (nulos * 100) / totalEleitores;
    }
    /**
     * Exercício 1 - Método que calcula percentual de Votos em Branco.
     * @param totalEleitores
     * @param brancos
     * @return
     */
    public Integer calculaVotosBrancos(Integer totalEleitores, Integer brancos){
        return (brancos * 100) / totalEleitores;
    }

    /**
     * Exercício 2 - Ordenar Vetor utilizando Bubble Sort.
     * @param vetor
     * @return Vetor Ordenado;
     */
    public Integer[] ordenarVetor(Integer[] vetor){
        int aux = 0;
        int i = 0;
        for(i = 0; i<8; i++){
            for(int j = 0; j<7; j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }

    /**
     * Exercício 3 - Calcula fatorial do número informado.
     * @param numero
     * @return
     */
    public String calcularFatorial(Integer numero) {
        String fatorial = numero + "! = ";
        int f = 1;

        if(numero >= 2) {
            for(int i = 1; i <= numero; i++) {
                f *= i;
                if(i != numero) {
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

    /**
     * Exercício 4 - Somar os múltiplos de 3 e 5 referente ao Número Informado.
     * @param numero
     * @return
     */
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
