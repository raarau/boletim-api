/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.presenters.test;

import br.com.bandtec.boletim.domain.Aluno;
import br.com.bandtec.boletim.domain.Boletim;
import br.com.bandtec.boletim.domain.Disciplina;
import br.com.bandtec.boletim.domain.Unidade;
import br.com.bandtec.presenters.BoletimPresenter;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoletimPresenterTest {
    

    /**
     * Test of calculaMedia method, of class BoletimPresenter.
     */
    @Test
    public void testCalculaMedia() {
        
        
        /*
        Teste que valida se o aluno passou pela media da unidade.
        */
        Unidade unidade1 = new Unidade();
        Boletim boletim1 = new Boletim();
        Aluno aluno1 = new Aluno(0);
        Disciplina sistemasDistr = new Disciplina();
        
        unidade1.setNome("Bandtec");
        unidade1.setMedia(5.0);
        unidade1.setFrenquencia(10);
        
        aluno1.setUnidade(unidade1);
                
        
        boletim1.setAluno(aluno1);
        boletim1.setNota1(9.0);
        boletim1.setNota2(9.0);
        boletim1.setNota3(4.5);
        sistemasDistr.setNome("Sistemas distribuidos");
        boletim1.setDisciplina(sistemasDistr);
        
        boletim1.setFrequencia(10);
        
        BoletimPresenter boletimAluno1 = new BoletimPresenter(boletim1);
        
        assertTrue(boletimAluno1.isResultado());
        
        
        /*Teste que valida se o aluno reprovou por nota abaixo da media 
        da unidade.*/
        unidade1.setNome("Bandtec");
        unidade1.setMedia(5.0);
        unidade1.setFrenquencia(10);
        
        aluno1.setUnidade(unidade1);
                
        
        boletim1.setAluno(aluno1);
        boletim1.setNota1(3.0);
        boletim1.setNota2(4.0);
        boletim1.setNota3(4.0);
        sistemasDistr.setNome("Sistemas distribuidos");
        boletim1.setDisciplina(sistemasDistr);
        
        boletim1.setFrequencia(10);
        
        BoletimPresenter boletimAluno2 = new BoletimPresenter(boletim1);
        
        assertFalse(boletimAluno2.isResultado());
        
        /*
        Verifica se o aluno reprovou pelo por exceder o numero maximo de faltas
        da unidade.
        */
        unidade1.setNome("Bandtec");
        unidade1.setMedia(5.0);
        unidade1.setFrenquencia(10);
        
        aluno1.setUnidade(unidade1);
                
        
        boletim1.setAluno(aluno1);
        boletim1.setNota1(5.0);
        boletim1.setNota2(7.0);
        boletim1.setNota3(10.0);
        sistemasDistr.setNome("Sistemas distribuidos");
        boletim1.setDisciplina(sistemasDistr);
        
        boletim1.setFrequencia(1);
        
        BoletimPresenter boletimAluno3 = new BoletimPresenter(boletim1);
        
        assertFalse(boletimAluno3.isResultado());
        
        
        
        
        
    }

    
}
