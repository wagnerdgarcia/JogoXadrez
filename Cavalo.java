
/**
 * Escreva a descrição da classe Cavalo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Cavalo extends Peca
{
    /**
     * Construtor para objetos da classe Cavalo
     */
    public Cavalo(Casa casa, boolean tipo)
    {
        super(casa, tipo);
    }
    
    /**
     * retorna o tipo da peca.
     */
    public int getTipo(){
        return 3;
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public void mover(Casa destino, Jogo jogo){
        ;
    }
}
