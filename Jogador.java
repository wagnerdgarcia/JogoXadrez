/**
 * Importando as Bibliotecas
 */
import java.util.ArrayList;

/**
 * Escreva a descrição da classe Jogador aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Jogador
{
    private ArrayList <Peca> pecasValidas;

    /**
     * Construtor para objetos da classe Jogador
     */
    public Jogador()
    {
        pecasValidas = new ArrayList <Peca> ();
    }

    public void addPeca(Peca peca){
        pecasValidas.add(peca);
    }
    
    public ArrayList<Peca> getPecas(){
        return pecasValidas;
    }
}
