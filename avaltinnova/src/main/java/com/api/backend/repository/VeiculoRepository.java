package com.api.backend.repository;

import com.api.backend.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByMarcaAndAnoAndDescricao( String marca, Integer ano, String descricao);
}
