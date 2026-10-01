package lab2;

public class RegistroTempoOnline {
    public String nomeDisciplina;
    public int tempoInvestidoOnline ;
    public int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }


    public void adicionaTempoOnline(int horas) {
         tempoInvestidoOnline += horas;
    }
    public boolean atingiuMetaTempoOnline(){
        if(tempoInvestidoOnline >= tempoOnlineEsperado){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nomeDisciplina+" "+ tempoInvestidoOnline +"/"+ tempoOnlineEsperado;
    }
}