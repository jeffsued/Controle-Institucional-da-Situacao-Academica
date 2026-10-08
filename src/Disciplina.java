package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private int numNotas;
    private int[] pesos = new int[];
    private double[] Notas = new double[numNotas];

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;

    }
    public Disciplina(String nomeDisciplina, int numNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.numNotas = numNotas;
        Arrays.fill(pesos,1);
    }
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.numNotas = numNotas;
        this.pesos = pesos;
    }

    public Disciplina(  ){}

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        Notas[nota-1] = valorNota;
    }

    public boolean aprovado() {
        return calculaMedia(Notas) >= 7.0;
    }

    public double calculaMedia(double[] nums){
//uma disciplina de 2 notas e pesos [6, 4] tem sua média calculada como (6 * notas[0] + 4 * notas[1]) / 10.(implementar posteriormente)
        double soma = 0;
        for(int i = 0; i < nums.length; i++){
            soma += Notas[i];
        }
        return soma/Notas.length;
    }

    @Override
    public String toString() {
       double media = calculaMedia(Notas);
        return nomeDisciplina +" " + horasDeEstudo +" "+ media+" " + Arrays.toString(Notas);
    }
}