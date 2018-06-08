package br.com.bandtec.presenters;

import br.com.bandtec.boletim.controllers.BoletimController;
import br.com.bandtec.boletim.domain.Boletim;

public class BoletimPresenter {

    private double nota1;
    private double nota2;
    private double nota3;
    private double frequenciaMax;
    private double frequencia;
    private boolean aprovado;
    private double calcMedia;

    public BoletimPresenter(Boletim boletim) {

        frequencia = boletim.getFrequencia();
        nota1 = boletim.getNota1();
        nota2 = boletim.getNota2();
        nota3 = boletim.getNota3();

        if (boletim.getAluno().getUnidade().getFrenquencia() < boletim.getFrequencia()) {
            aprovado = false;
        } else {
            aprovado = true;
        }

        if (boletim.getMedia() < boletim.getAluno().getUnidade().getMedia()) {
            aprovado = false;
        } else {
            aprovado = true;
        }

    }

    public void calculaMedia(Boletim boletim) {
        
        calcMedia = (nota1 + nota2 + nota3) / 3;
        
        boletim.setMedia(calcMedia);
        
    }
    
    public void validaFrequencia(Boletim boletim){
        
        frequenciaMax = 20;
        
        boletim.setFrequencia(frequenciaMax);
    }

}

//DVWA para realizar diversos testes de vulnerabilidade.
