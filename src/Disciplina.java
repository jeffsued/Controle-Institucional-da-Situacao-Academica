package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] Notas = new double[4];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        Notas[nota-1] = valorNota;
    }

    public boolean aprovado() {
        //Como o bloco de código a seguir se repete, ele poderia estar como um metodo auxiliar
        double soma = 0;
        for(int i = 0; i < Notas.length; i++){
            soma += Notas[i];
        }
        double media = soma/Notas.length;
        return media >= 7.0;
    }

    @Override
    public String toString() {
        double soma = 0;
        for(int i = 0; i < Notas.length; i++){
            soma += Notas[i];
        }
        double media = soma/Notas.length;
        return nomeDisciplina +" " + horasDeEstudo +" "+ media+" " + Arrays.toString(Notas);
    }
}