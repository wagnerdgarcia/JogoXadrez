
/**
 * Representa uma Pe�a do jogo.
 * Possui uma casa e um tipo associado.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public abstract class Peca {
    private Casa casa;
    private boolean cor;

    public Peca(Casa casa, boolean cor) {
        this.casa = casa;
        this.cor = cor;
        casa.colocarPeca(this);
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public abstract void mover(Casa destino, Jogo jogo);

    /**
     * retorna o tipo da peca.
     */
    public abstract int getTipo();
    
    /**
     * retorna o tipo da peca.
     */
    public Casa getCasa() {
        return casa;
    }
    
    /**
     * retorna o tipo da peca.
     */
    public boolean getCor() {
        return cor;
    }
    
    /**
     * Realiza o Movimento Basico
     */
    public void movimentoBasico(Casa destino){
        casa.removerPeca();
        destino.colocarPeca(this);
        casa = destino;            
    }
}
