/**
 * Escreva a descrição da classe Rei aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Rei extends Peca
{
    /**
     * Construtor para objetos da classe Rei
     */
    public Rei(Casa casa, boolean tipo)
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