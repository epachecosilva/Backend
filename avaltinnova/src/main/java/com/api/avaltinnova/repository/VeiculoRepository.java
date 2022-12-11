package com.api.avaltinnova.repository;

import com.api.avaltinnova.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByMarcaAndAnoAndDescricao( String marca, Integer ano, String descricao);
}
