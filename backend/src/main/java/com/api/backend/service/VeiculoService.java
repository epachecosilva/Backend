package com.api.backend.service;

import com.api.backend.model.Veiculo;
import com.api.backend.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {
    @Autowired
    VeiculoRepository veiculoRepository;

    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }

    public Veiculo save(Veiculo veiculo) {
        try {
            return veiculoRepository.save(veiculo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Optional<Veiculo> findById(Long id) {
        return veiculoRepository.findById(id);
    }

}
