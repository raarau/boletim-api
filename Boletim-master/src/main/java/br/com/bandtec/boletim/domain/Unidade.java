/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.boletim.domain;

import java.text.DecimalFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Rodrigo
 */
@Entity
public class Unidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String nome;
    private String endereco;
    private Double media;
    private int frenquencia;
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getMedia() {
        DecimalFormat arredondar = new DecimalFormat();
        arredondar.setMinimumFractionDigits(3);
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public int getFrenquencia() {
        return frenquencia;
    }

    public void setFrenquencia(int frenquencia) {
        this.frenquencia = frenquencia;
    }
    
    
    
}
