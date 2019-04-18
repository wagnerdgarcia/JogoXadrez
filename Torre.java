/**
 * Escreva a descrição da classe Torre aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Torre extends Peca
{
    /**
     * Construtor para objetos da classe Torre
     */
    private boolean primeiroMovimento;
    public Torre(Casa casa, boolean cor)
    {
        super(casa, cor);
        primeiroMovimento = false;
    }
    
    /**
     * retorna o tipo da peca.
     */
    public int getTipo(){
        return 2;
    }
    
    /**
     * Movimenta a peca para uma nova casa.
     * @param destino nova casa que ira conter esta peca.
     */
    public void mover(Casa destino, Jogo jogo){
        if(podeIR(destino, jogo)){
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
            else{
                movimentoBasico(destino);
                primeiroMovimento = true;
            }
        }
    }
    
    /**
     * Realiza o movimento Simples da Torre
     */
    private boolean podeIR(Casa destino, Jogo jogo){
        Casa origem = getCasa();
        if ((origem.getX() != destino.getX()) && (origem.getY() == destino.getY())){
            if (origem.getX() < destino.getX()){
                for (int x = origem.getX() + 1; x < destino.getX(); x++){
                    Casa casaVerificada = jogo.getTabuleiro().getCasa(x, origem.getY());
                    if(casaVerificada.possuiPeca()){
                        return false;
                    }
                }
            }
            else if (origem.getX() > destino.getX()){
                for (int x = origem.getX() - 1; x > destino.getX(); x--){
                    Casa casaVerificada = jogo.getTabuleiro().getCasa(x, origem.getY());
                    if(casaVerificada.possuiPeca()){
                        return false;
                    }
                }
            }
        }
        
        else if ((origem.getY() != destino.getY()) && (origem.getX() == destino.getX())){
            if (origem.getY() < destino.getY()){
                for (int y = origem.getY() + 1; y < destino.getY(); y++){
                    Casa casaVerificada = jogo.getTabuleiro().getCasa(origem.getX(), y);
                    if(casaVerificada.possuiPeca()){
                        return false;
                    }
                }
            }
            else if (origem.getY() > destino.getY()){
                for (int y = origem.getY() - 1; y > destino.getY(); y--){
                    Casa casaVerificada = jogo.getTabuleiro().getCasa(origem.getX(), y);
                    if(casaVerificada.possuiPeca()){
                        return false;
                    }
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    
}