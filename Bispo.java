
/**
 * Escreva a descrição da classe Bispo aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Bispo extends Peca
{
    /**
     * Construtor para objetos da classe Bispo
     */
    public Bispo(Casa casa, boolean tipo)
    {
        super(casa, tipo);
    }
    
    /**
     * retorna o tipo da peca.
     */
    public int getTipo(){
        return 6;
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public void mover(Casa destino, Jogo jogo){
        ;
    }
}