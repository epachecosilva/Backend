package com.api.avaltinnova.service;

import com.api.avaltinnova.model.Veiculo;
import com.api.avaltinnova.repository.VeiculoRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    public void delete(Veiculo veiculo){
        veiculoRepository.delete(veiculo);
    }
}
