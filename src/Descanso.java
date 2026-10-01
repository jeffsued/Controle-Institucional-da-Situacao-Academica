package lab2;

public class Descanso {
    private int horasDescanso;
    public int semanas;

    public Descanso() {
    }
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.semanas = valor;
    }
    public String getStatusGeral() {
        if (horasDescanso != 0 && semanas != 0 && (horasDescanso/semanas) >= 26){
            return "Descansado";
        }
        return "Cansado";
    }

}