package lab2;

public class RegistroResumos {
    private Resumo[] resumo;
    private int numeroDeResumos;
    private int cont;

    public RegistroResumos(int numeroDeResumos) {
        this.resumo = new Resumo[numeroDeResumos];
    }

    public void adiciona(String tema, String conteudo) {
        resumo[cont] = new Resumo(tema, conteudo);
        cont++;
    }

    public String[] pegaResumos() {
        String[] tema = new String[cont];
        for(int i = 0; i < cont; i++){
            tema[i] = resumo[i].getTema();
        }
        return tema;
    }

    public String imprimeResumos() {
        String temas = "";
        for(int i= 0; i< cont; i++){
            if(i == 0){
                temas += resumo[i].getTema();
            }
            else {
                temas += " | " + resumo[i].getTema();
            }
        }

        return "- " + cont + " resumo(s) cadastrado(s)\n- " + temas;
    }

    public int conta() {
        return cont;
    }
    public boolean temResumo(String tema) {

        for(int i = 0; i< cont; i++){
            if(resumo[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }
}