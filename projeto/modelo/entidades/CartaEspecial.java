
package main.java.projeto.modelo.entidades;

import javax.swing.ImageIcon;
import main.java.projeto.modelo.entidades.Carta;
import main.java.projeto.modelo.enumeradores.Acao;
import main.java.projeto.modelo.enumeradores.Cor;

public class CartaEspecial extends Carta{
    private Cor corCarta;
    private Acao acaoCarta;
    
    public CartaEspecial (Cor corCarta, Acao acaoCarta, ImageIcon frenteCarta){
        this.corCarta = corCarta;
        this.acaoCarta = acaoCarta;
        this.setFrenteCarta(frenteCarta);
    }

    public Cor getCorCarta() {
        return corCarta;
    }

    public Acao getAcaoCarta() {
        return acaoCarta;
    }
    
}
