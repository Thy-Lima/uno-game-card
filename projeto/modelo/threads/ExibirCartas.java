
package main.java.projeto.modelo.threads;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.projeto.modelo.estruturas.DeckJogador;
import main.java.projeto.modelo.entidades.Carta;
import javax.swing.JButton;
import javax.swing.JLabel;


public class ExibirCartas extends Thread{
    private JButton[] botoes;
    private JButton acao;
    private DeckJogador<Carta> jogador;
    private String nomeJogador;
    private JButton legenda;
    
    public ExibirCartas(JButton[] botoes, DeckJogador<Carta> jogador, JButton acao, JButton legenda, String nomeJogador){
        this.botoes = botoes;
        this.jogador = jogador;
        this.acao = acao;
        this.legenda = legenda;
        this.nomeJogador = nomeJogador;
        
    }
    
    @Override
    public void run(){
        this.acao.setVisible(false);
        try{
            for(int i = 0; i < 7; i++){
                this.botoes[i].setIcon(this.jogador.mostrarPorIndice(i+1).getVersoCarta());
                Thread.sleep(400);
                
            }
            
            for(int i = 0; i < 7; i++){
                this.botoes[i].setIcon(this.jogador.mostrarPorIndice(i+1).getFrenteCarta());
                Thread.sleep(700);
            }
            
            for(int i = 0; i < 7; i++){
                this.botoes[i].setIcon(this.jogador.mostrarPorIndice(i+1).getVersoCarta());
                Thread.sleep(900);
            }
            
            this.acao.setVisible(true);
            this.legenda.setText(this.nomeJogador);
                        
        }catch(InterruptedException ex){
            Logger.getLogger(ExibirCartas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
