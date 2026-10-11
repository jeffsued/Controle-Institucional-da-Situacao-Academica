package lab2;
import java.util.Arrays;

/**
 * Representa uma disciplina do sistema CoISA, com notas, pesos e horas
 * de estudo. A média é aritmética quando não há pesos e ponderada quando
 * os pesos são informados.
 * @author Jefferson Sued
 */
public class Disciplina {
    private String nomeDisciplina;
    private int horasDeEstudo;
    private int numNotas;
    private int[] pesos;
    private double[] notas;

/**
 * Cria uma disciplina com 4 notas, todas com o mesmo peso.
 */
    public Disciplina(String nomeDisciplina){
        this(nomeDisciplina,4);
    }

/**
 * Cria uma disciplina com a quantidade de notas informada, todas com
 * o mesmo peso (média aritmética).
 * @param numNotas quantidade de notas da disciplina
 */
    public Disciplina(String nomeDisciplina, int numNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.numNotas = numNotas;
        this.notas = new double[numNotas];
        this.pesos = new int[numNotas];
        Arrays.fill(this.pesos, 1);
    }

/**
 * Cria uma disciplina com a quantidade de notas e os pesos informados
 * (média ponderada). Por exemplo, com pesos [6, 4] a média é
 * (6 * notas[0] + 4 * notas[1]) / 10.
 * @param pesos peso de cada nota, na mesma ordem das notas
 * @throws IllegalArgumentException se a quantidade de pesos for diferente de numNotas
 */
    public Disciplina(String nomeDisciplina, int numNotas, int[] pesos){
        if(pesos.length != numNotas){
            throw new IllegalArgumentException("Quantidade de pesos diferente da quantidade notas");
        }
        this.nomeDisciplina = nomeDisciplina;
        this.numNotas = numNotas;
        this.notas = new double[numNotas];
        this.pesos = Arrays.copyOf(pesos, pesos.length);
    }

/**
 * Soma horas de estudo ao total já cadastrado.
 * @param horas quantidade de horas a adicionar
 */
    public void cadastraHoras(int horas) {
        this.horasDeEstudo += horas;
    }

/**
 * Cadastra o valor de uma nota. Se a nota já tiver sido cadastrada,
 * o valor anterior é sobrescrito.
 * @param nota número da nota, começando em 1
 * @param valorNota valor da nota
 * @throws IllegalArgumentException se o número da nota for menor que 1 ou maior que a quantidade de notas da disciplina
 */
    public void cadastraNota(int nota, double valorNota) {
        notas[nota-1] = valorNota;
    }

/**
 * Informa se o aluno foi aprovado na disciplina.
 * @return true se a média for maior ou igual a 7.0, false caso contrário
 */
    public boolean aprovado() {
        return calculaMedia() >= 7.0;
    }

/**
 * Calcula a média da disciplina usando os pesos de cada nota. Notas
 * ainda não cadastradas valem 0.0. Se nenhum peso foi informado, todos valem 1 e a média é aritmética.
 * @return a média ponderada das notas
 */
    public double calculaMedia() {
        double somaNotas = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        return somaNotas / somaPesos;
    }

/**
 * Representa a disciplina no formato "nome horas média [notas]".
 */
    @Override
    public String toString() {
       double media = calculaMedia();
        return nomeDisciplina +" " + horasDeEstudo +" "+ media+" " + Arrays.toString(notas);
    }
}