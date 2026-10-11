package lab2;
/**
 * Representa um resumo cadastrado no sistema CoISA, formado por um tema e pelo conteúdo escrito sobre ele.
 * @author Jefferson Sued
 */
public class Resumo {
    private String tema;
    private String conteudo;

/**
 * Cria um resumo com o tema e o conteúdo informados.
 */
    public Resumo(String tema,String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

/**
 * Devolve o tema do resumo.
 */
    public String getTema() {
        return tema;
    }

/**
 * Devolve o conteudo do resumo
 */
    public String getConteudo() {
        return conteudo;
    }
}
