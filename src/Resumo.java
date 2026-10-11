package lab2;
/**
 * Representa um resumo cadastrado no sistema CoISA, formado por um tema
 * e pelo conteúdo escrito sobre ele.
 *
 * @author Jefferson Sued
 */

public class Resumo {
    private String tema;
    private String conteudo;

/**
 * Cria um resumo com o tema e o conteúdo informados.
 *
 * @param tema título do resumo
 * @param conteudo texto do resumo
 */
    public Resumo(String tema,String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

/**
 * Devolve o tema do resumo.
 * @return retorna o tema.
 */
    public String getTema() {
        return tema;
    }
/**
 * Devolve o conteudo do resumo
 * @return retorna o Conteudo do resumo.
 */
    public String getConteudo() {
        return conteudo;
    }
}
