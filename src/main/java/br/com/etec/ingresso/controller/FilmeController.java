package br.com.etec.ingresso.controller;

import br.com.etec.ingresso.entity.Filme;
import br.com.etec.ingresso.enuns.ClassificacaoIndicativaEnum;
import br.com.etec.ingresso.enuns.SimNaoEnum;
import br.com.etec.ingresso.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filmes")

public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public List<Filme> listar(){
        return filmeRepository.findAll();
    }
    List<Long> idsInexistentes = List.of(1L, 2L, 3L);

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id){
        var filme1 = filmeRepository.findById(id); //Optional<Filme>
        if(filme1.isPresent()) {
            return ResponseEntity.ok((filme1.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Filme> cadastrar(@RequestBody Filme filme){
        filme.setId(100L);
        return ResponseEntity.status(HttpStatus.CREATED).body(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizar(@RequestBody Filme filme, @PathVariable Long id){
        if(idsInexistentes.contains(id)){
            return ResponseEntity.ok(filme);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        if(idsInexistentes.contains(id)){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}

