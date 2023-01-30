package com.api.backend.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO {
    private String veiculo;
    private String marca;
    private String descricao;
    private Integer ano;
    private Boolean vendido;
    private LocalDateTime created;
    private LocalDateTime updated;
}
