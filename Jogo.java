
/**
 * Armazena o tabuleiro e responsavel por posicionar as pecas.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Jogo {

    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    
    public Jogo() {
        tabuleiro = new Tabuleiro();
        jogador1 = new Jogador();
        jogador2 = new Jogador();
        criarPecas();
    }
    
    /**
     * Posiciona pe�as no tabuleiro.
     * Utilizado na inicializa�ao do jogo.
     */
    private void criarPecas() {
        for (int x = 0; x < 8; x++){
            Casa casa = tabuleiro.getCasa(x, 1);
            Peca peca = new Peao(casa, true);
            jogador1.addPeca(peca);
        }
        for (int x = 0; x < 8; x++){
            Casa casa = tabuleiro.getCasa(x, 6);
            Peca peca = new Peao(casa, false);
            jogador2.addPeca(peca);
        }
        
        Casa casaTorreB1 = tabuleiro.getCasa(0, 0);
        Peca torreB1 = new Torre(casaTorreB1, true);
        jogador1.addPeca(torreB1);
        
        Casa casaTorreB2 = tabuleiro.getCasa(0, 7);
        Peca torreB2 = new Torre(casaTorreB2, true);
        jogador1.addPeca(torreB2);
        
        
        System.out.println("Jogador 1" + jogador1.getPecas());
        System.out.println("Jogador 2" + jogador2.getPecas());
    }
    
    /**
     * Comanda uma Pe�a na posicao (origemX, origemY) fazer um movimento 
     * para (destinoX, destinoY).
     * 
     * @param origemX linha da Casa de origem.
     * @param origemY coluna da Casa de origem.
     * @param destinoX linha da Casa de destino.
     * @param destinoY coluna da Casa de destino.
     */
    public void moverPeca(int origemX, int origemY, int destinoX, int destinoY) {
        Casa origem = tabuleiro.getCasa(origemX, origemY);
        Casa destino = tabuleiro.getCasa(destinoX, destinoY);
        Peca peca = origem.getPeca();
        peca.mover(destino, this);
    }
    
    /**
     * @return o Tabuleiro em jogo.
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
