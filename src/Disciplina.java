package lab2;

public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private double[] Notas = new double[4];

    public Disciplina(nomeDisciplina String){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        Notas[nota-1] = valorNota;
    }

    public boolean aprovado() {
        media >= 7.0
    }

    public String toString() {
        return  "nomeDisciplina='" + nomeDisciplina + '\'' +
                ", horasDeEstudo=" + horasDeEstudo +
                ", Notas=" + java.util.Arrays.toString(Notas) +
                '';
    }
}