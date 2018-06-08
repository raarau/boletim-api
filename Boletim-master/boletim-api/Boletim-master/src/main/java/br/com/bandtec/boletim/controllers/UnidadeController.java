/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.boletim.controllers;

import br.com.bandtec.boletim.repository.UnidadeRepository;
import com.bandtec.boletimapi.domain.Unidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/unidade")
public class UnidadeController {
    
        @Autowired
    private UnidadeRepository repository;

    @GetMapping
    public ResponseEntity getTodos() {
        Iterable<Unidade> unidades = this.repository.findAll();

        return ResponseEntity.ok(unidades);
    }
    
        @PostMapping
    public ResponseEntity criar(@RequestBody Unidade unidade) {
        
        this.repository.save(unidade);
        
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    
    
    @DeleteMapping("/{id}")
    public ResponseEntity excluir(
            @PathVariable("id") Integer id) {
        
        this.repository.delete(id);
        
        return ResponseEntity.ok().build();
    }
    
  @GetMapping("/{id}")
    public ResponseEntity getUm(@PathVariable("id") Integer id)
    {
      Unidade unidade = this.repository.findOne(id);
        return ResponseEntity.ok(unidade);
    }
}