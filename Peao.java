
/**
 * Escreva a descrição da classe Peao aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Peao extends Peca
{
    /**
     * Construtor para objetos da classe Peao
     */
    private boolean primeiroMovimento;
    private int direcao;
    
    public Peao(Casa casa, boolean cor)
    {
        super(casa, cor);
        primeiroMovimento = false;
        definirDirecao();
    }
    
    /**
     * retorna o tipo da peca.
     */
    public int getTipo(){
        return 1;
    }
    
    /**
     * Define a Direçao da Peca
     */
    private void definirDirecao(){
        if (getCor()){
            direcao = 1;
        }
        else  if (!getCor()){
            direcao = -1;
        }
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public void mover(Casa destino, Jogo jogo){
        if(podeIR(destino,jogo)){
            if(!destino.possuiPeca()){
                movimentoBasico(destino);
                primeiroMovimento = true;
            }
        }
        else if(podeCapturar(destino, jogo)){
            if(destino.possuiPeca()){
                if(!destino.getPeca().getCor() && getCor()){
                    destino.removerPeca();
                    movimentoBasico(destino);
                    primeiroMovimento = true;
                }
                else if(destino.getPeca().getCor() && !getCor()){
                    destino.removerPeca();
                    movimentoBasico(destino);
                    primeiroMovimento = true;
                }
            }
        }
    }
    
    /**
     * Verifica se Pode Movimentar
     */
    private boolean podeIR(Casa destino, Jogo jogo){
        Casa origem = getCasa();
        if (!primeiroMovimento && ((origem.getX() == destino.getX()) && ((destino.getY() == origem.getY() + 2 ) || (destino.getY() == origem.getY() - 2 )))){
            return true;
        }
        else if (((origem.getX() == destino.getX()) && (destino.getY() == origem.getY() + direcao ))){
            return true;
        }
        return false;
    }
    /**
     * Verifica se Pode Movimentar
     */
    private boolean podeCapturar(Casa destino, Jogo jogo){
        Casa origem = getCasa();
        if (((origem.getX() == destino.getX() - 1) && (destino.getY() == origem.getY() + direcao ))){
            return true;
        }
        else if (((origem.getX() == destino.getX() + 1) && (destino.getY() == origem.getY() + direcao ))){
            return true;
        }
        return false;
    }
}