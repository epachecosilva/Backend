package com.api.avaltinnova.controller;

import com.api.avaltinnova.dto.VeiculoDTO;
import com.api.avaltinnova.model.Veiculo;
import com.api.avaltinnova.repository.VeiculoRepository;
import com.api.avaltinnova.service.VeiculoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/veiculos")
public class VeiculosController {

    @Autowired
    VeiculoRepository veiculoRepository;
    @Autowired
    VeiculoService veiculoService;

    @GetMapping
    public ResponseEntity<List<Veiculo>> listarTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.findAll());
    }
    @GetMapping("/buscarPorMarcaAnoDescricao")
    public ResponseEntity listarPorMarcaAnoDescricao(@RequestParam String marca, @RequestParam Integer ano,
                                                     @RequestParam String descricao) {
        return new ResponseEntity<>(veiculoRepository.findByMarcaAndAnoAndDescricao(marca, ano, descricao), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneParkingSpot(@PathVariable Long id){
        Optional<Veiculo> veiculoOptional = veiculoRepository.findById(id);
        if (!veiculoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Veículo não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(veiculoOptional.get());
    }
    @PostMapping
    public ResponseEntity<Object> cadastrarVeiculo(@RequestBody VeiculoDTO veiculoDTO){
        var veiculo = new Veiculo();
        BeanUtils.copyProperties(veiculoDTO, veiculo);
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        veiculo.setCreated(sqlDate);
        veiculo.setUpdated(sqlDate);
        return ResponseEntity.status(HttpStatus.CREATED).body(veiculoService.save(veiculo));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> atualizarVeiculo(@PathVariable Long id,
                                                    @RequestBody VeiculoDTO veiculoDTO){
        Optional<Veiculo> veiculoOptional = veiculoService.findById(id);
        if (!veiculoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Veículo não encontrado.");
        }
        var veiculo = new Veiculo();
        BeanUtils.copyProperties(veiculoDTO, veiculo);
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        veiculo.setId(veiculoOptional.get().getId());
        veiculo.setCreated(veiculoOptional.get().getCreated());
        veiculo.setUpdated(sqlDate);

        return ResponseEntity.status(HttpStatus.OK).body(veiculoService.save(veiculo));
    }
    @PatchMapping("/{id}")
    public ResponseEntity atualizarMarcaVeiculo(@RequestBody Veiculo novoVeiculo, @PathVariable Long id) {
        try {
            Veiculo veiculo = veiculoRepository.findById(id).get();
            veiculo.setMarca(novoVeiculo.getMarca());

            return new ResponseEntity<>(
                    veiculoRepository.save(veiculo),
                    HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity excluirVeiculo(@PathVariable Long id) {
        try {
            return veiculoRepository.findById(id)
                    .map(veiculo -> {
                        veiculoRepository.deleteById(id);
                        return ResponseEntity.ok().build();
                    }).orElse(ResponseEntity.notFound().build());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
