package lab2;

public class Descanso {
    private int horasDescanso
    public int semanas;

    public Descanso(int horasDescanso, int semanas) {
        this.horasDescanso = horasDescanso;
        this.semanas = semanas;
    }

    public void defineHorasDescanso(int valor) {
        return this.horasDescanso;
    }

    public void defineNumeroSemanas(int valor) {
        return this.semanas;
    }

    public String getStatusGeral() {
        if (horasDescanso != 0 && semanas != 0 && (horasDescanso/semanas) >= 26){
            return "Descansado";
        }
        return "Cansado";
    }

}