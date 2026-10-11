package lab2;
import java.util.Arrays;

/**
 * Gerencia uma coleção de resumos com capacidade fixa.
 * Permite adicionar resumos, listar os temas cadastrados e buscar resumos pelo conteúdo.
 * @author Jefferson Sued
 */
    public class RegistroResumos {
        private Resumo[] resumo;
        private int numeroDeResumos;
        private int cont;

/**
 * Cria um registro com capacidade para a quantidade de resumos informada.
 * "numeroDeResumos" é quantidade máxima de resumos do registro
 */
    public RegistroResumos(int numeroDeResumos) {
        this.resumo = new Resumo[numeroDeResumos];
    }

/**
 * Adiciona um novo resumo ao registro.
 */
    public void adiciona(String tema, String conteudo) {
        if (cont >= resumo.length) {
            //se o registro já estiver cheio
            throw new IllegalStateException("Registro cheio");
        }
        resumo[cont] = new Resumo(tema, conteudo);
        cont++;
    }

/**
 * Devolve os temas de todos os resumos cadastrados, na ordem de cadastro.
 * retorna um array com os temas cadastrados
 */
    public String[] pegaResumos() {
        String[] tema = new String[cont];
        for(int i = 0; i < cont; i++){
            tema[i] = resumo[i].getTema() + ": " + resumo[i].getConteudo();
        }
        return tema;
    }

/**
 * Monta uma representação textual do registro, com a quantidade de
 * retorna texto com a quantidade de resumos e a lista de temas
 */
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

/**
 * Informa quantos resumos estão cadastrados.
 **/
    public int conta() {
        return cont;
    }

/**
 * Verifica se existe um resumo cadastrado com o tema informado.
 * o parametro "tema" é o que vai ser procurado.
 * retorna true se existir um resumo com esse tema, ou false caso contrário.
 */
    public boolean temResumo(String tema) {
        for(int i = 0; i< cont; i++){
            if(resumo[i].getTema().equals(tema)){
                return true;
            }
        }
        return false;
    }

/**
 * Busca os resumos cujo conteúdo contém a chave de busca, ignorando maiúsculas e minúsculas, por causa do "toLowerCase()".
 * "chaveDeBusca" é a palavra a ser procurada no conteúdo dos resumos e retorna os temas dos resumos encontrados, em ordem alfabética.
 */
    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        String[] temas = new String[cont];
        int Achados = 0;

        for (int i = 0; i < cont; i++) {
            String conteudo = resumo[i].getConteudo().toLowerCase();
            if (conteudo.contains(chave)) {
                temas[Achados] = resumo[i].getTema();
                Achados++;
            }
        }
        temas = Arrays.copyOf(temas, Achados);
        Arrays.sort(temas);
        return temas;
    }
}