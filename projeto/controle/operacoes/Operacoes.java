
package main.java.projeto.controle.operacoes;
import main.java.projeto.modelo.entidades.Carta;
import main.java.projeto.modelo.entidades.CartaComum;
import main.java.projeto.modelo.entidades.CartaEspecial;
import main.java.projeto.modelo.estruturas.DeckJogador;
import main.java.projeto.modelo.estruturas.PilhaPrincipal;
import main.java.projeto.controle.fabrica.FabricaCartas;


public class Operacoes {
    private PilhaPrincipal pilhaCentral;
    private DeckJogador<Carta> jogador1;
    private DeckJogador<Carta> jogador2;
    
    public Operacoes(){
        this.pilhaCentral = new PilhaPrincipal();
        this.jogador1 = new DeckJogador();
        this.jogador2 = new DeckJogador();
        this.gerarPilha();
        this.pilhaCentral.embaralhar();
        
        
    }

    public DeckJogador<Carta> getJogador1() {
        return jogador1;
    }

    public DeckJogador<Carta> getJogador2() {
        return jogador2;
    }

    public PilhaPrincipal getPilhaCentral() {
        return pilhaCentral;
    }
    
    
    
    
    private void gerarPilha(){
        for(int i = 0; i < 109; i++){
            pilhaCentral.adicionar(FabricaCartas.fabricarCartas(i));
        }
    }
    
    public void gerarDeck(DeckJogador<Carta> umJogador){
        for(int i = 0; i < 7; i++){
            umJogador.adicionar((Carta) pilhaCentral.remover());
        }
    }
    
    public Carta cartaInicial(){
        return (Carta) pilhaCentral.remover();
    }
    
}
