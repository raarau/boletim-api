/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.boletim.controllers;

import br.com.bandtec.boletim.domain.Aluno;
import br.com.bandtec.boletim.repository.AlunoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")



public class AlunoController {
    
    
    @Autowired
    private AlunoRepository repository;

     static List<Aluno> alunos = new ArrayList<>();
   
    
    @GetMapping
    public ResponseEntity getTodos() {
        Iterable<Aluno> alunos = this.repository.findAll();

        return ResponseEntity.ok(alunos);
    }

    @PostMapping
    public ResponseEntity criar(@RequestBody Aluno aluno) {

        this.repository.save(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluir(
            @PathVariable("id") Integer id) {

        this.repository.delete(id);

        return ResponseEntity.ok().build();
    }
    
     @PutMapping
 
    public ResponseEntity atualizar(@RequestBody Aluno aluno)
    {
         this.repository.save(aluno);
        
        return ResponseEntity.ok().build();
    }

  @GetMapping("/{id}")
    public ResponseEntity getUm(@PathVariable("id") Integer id)
    {
      Aluno aluno = this.repository.findOne(id);
        return ResponseEntity.ok(aluno);
    }
}