package com.api.avaltinnova.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_VEICULO")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "VEICULO", length = 80, nullable = false)
    private String veiculo;

    @Column(name = "MARCA", length = 80, nullable = false)
    private String marca;

    @Column(name = "DESCRICAO", length = 80, nullable = false)
    private String descricao;

    @Column(name = "ANO")
    private Integer ano;

    @Column(name = "VENDIDO")
    private Boolean vendido;

    @Column(name = "CREATED")
    private Date created;

    @Column(name = "UPDATED")
    private Date updated;
}
