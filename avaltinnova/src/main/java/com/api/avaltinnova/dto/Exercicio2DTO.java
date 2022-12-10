package com.api.avaltinnova.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exercicio2DTO {
    private int[] vetorOriginal = {5, 3, 2, 4, 7, 1, 0, 6};
    private int[] vetorOrdenado = {5, 3, 2, 4, 7, 1, 0, 6};

    public int[] ordenarVetor(int[] vet){
        int aux = 0;
        int i = 0;
        for(i = 0; i<8; i++){
            for(int j = 0; j<7; j++){
                if(vetorOrdenado[j] > vetorOrdenado[j + 1]){
                    aux = vetorOrdenado[j];
                    vetorOrdenado[j] = vetorOrdenado[j+1];
                    vetorOrdenado[j+1] = aux;
                }
            }
        }
        System.out.println("Vetor organizado:");
        for(i = 0; i<8; i++){
            System.out.print(" "+ vetorOrdenado[i]);
        }
        return vetorOrdenado;
    }
}
