package lab2;

/**
 * Registra as horas de descanso do aluno em um período de semanas e informa se ele está descansado ou cansado.
 * @author Jefferson Sued
 */
public class Descanso {
    private int horasDescanso;
    private int semanas;

/**
 * Define o total de horas de descanso no período.
 */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

/**
 * Define o número de semanas do período.
 */
    public void defineNumeroSemanas(int valor) {
        this.semanas = valor;
    }

/**
 * Informa o status geral de descanso. O aluno está descansado quando a média de horas de descanso por semana é de pelo menos 26.
 * Se o número de semanas ainda não foi definido, o status é "Cansado".
 * retorna "Descansado" se a média semanal for maior ou igual a 26, ou "Cansado" caso não seja.
 */
    public String getStatusGeral() {
        if (horasDescanso != 0 && semanas != 0 && (horasDescanso/semanas) >= 26){
            return "Descansado";
        }
        return "Cansado";
    }

}