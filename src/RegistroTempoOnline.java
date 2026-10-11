package lab2;

/**
 * Registra o tempo online investido em uma disciplina e compara
 * com a meta de tempo esperado.
 * @author Jefferson Sued
 */
public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestidoOnline ;
    private int tempoOnlineEsperado;

/**
 * Cria um registro com a meta de tempo online informada.
 * @param nomeDisciplina nome da disciplina
 * @param tempoOnlineEsperado meta de horas online
 */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

/**
 * Cria um registro com a meta padrão de 120 horas online.
 * @param nomeDisciplina nome da disciplina
 */
    public RegistroTempoOnline(String nomeDisciplina) {
        this(nomeDisciplina,120);
    }

/**
 * Soma horas ao tempo online já investido.
 * @param horas quantidade de horas a adicionar
 */
    public void adicionaTempoOnline(int horas) {
         tempoInvestidoOnline += horas;
    }

/**
 * Informa se a meta de tempo online foi atingida.
 * @return true se o tempo investido for maior ou igual ao esperado
 */
    public boolean atingiuMetaTempoOnline() {
        return tempoInvestidoOnline >= tempoOnlineEsperado;
    }

    /**
     * Representa o registro: "disciplina investido/esperado".
     */
    @Override
    public String toString() {
        return nomeDisciplina+" "+ tempoInvestidoOnline +"/"+ tempoOnlineEsperado;
    }
}