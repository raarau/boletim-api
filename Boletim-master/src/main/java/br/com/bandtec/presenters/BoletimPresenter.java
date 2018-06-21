package br.com.bandtec.presenters;

import br.com.bandtec.boletim.controllers.BoletimController;
import br.com.bandtec.boletim.domain.Boletim;
import java.text.DecimalFormat;

public class BoletimPresenter {

    private double nota1;
    private double nota2;
    private double nota3;
    private int frequencia;
    //private int frequenciaUnidade;
    private boolean resultado;
    private double calcMedia;
    private String nomeDisciplina;

    public BoletimPresenter(Boletim boletim) {
        
        //DecimalFormat arredondar = new DecimalFormat();
        //arredondar.setMinimumFractionDigits(3);
        frequencia = boletim.getFrequencia();
        //frequenciaUnidade = boletim.getAluno().getUnidade().getFrenquencia();
        nota1 = boletim.getNota1();
        nota2 = boletim.getNota2();
        nota3 = boletim.getNota3();
        calcMedia = boletim.getMedia();
        //arredondar.format(calcMedia);
        //nomeDisciplina = boletim.getDisciplina().getNome();
        
        //Valida se o aluno possui a media minima e numero de frequencia permitido
        if (boletim.getAluno().getUnidade().getFrenquencia() >= boletim.getFrequencia() 
           && boletim.getMedia() >= boletim.getAluno().getUnidade().getMedia()) {
            resultado = true;
        } else {
            resultado = false;
        }

    }
/*
    public int getFrequenciaUnidade() {
        return frequenciaUnidade;
    }

    public void setFrequenciaUnidade(int frequenciaUnidade) {
        this.frequenciaUnidade = frequenciaUnidade;
    }
*/

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public double getCalcMedia() {
        return calcMedia;
    }

    public void setCalcMedia(double calcMedia) {
        this.calcMedia = calcMedia;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }  

}

//DVWA para realizar diversos testes de vulnerabilidade.
