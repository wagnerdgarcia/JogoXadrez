
/**
 * Escreva a descrição da classe Rainha aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Rainha extends Peca
{
    /**
     * Construtor para objetos da classe Rainha
     */
    public Rainha(Casa casa, boolean tipo)
    {
        super(casa, tipo);
    }
    
    /**
     * retorna o tipo da peca.
     */
    public int getTipo(){
        return 5;
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public void mover(Casa destino, Jogo jogo){
        ;
    }
}