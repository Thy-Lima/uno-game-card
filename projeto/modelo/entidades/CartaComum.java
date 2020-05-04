
package main.java.projeto.modelo.entidades;

import javax.swing.ImageIcon;
import main.java.projeto.modelo.entidades.Carta;
import main.java.projeto.modelo.enumeradores.Cor;


public class CartaComum extends Carta{
    private int numeroCarta;
    private Cor corCarta;
   
    
    public CartaComum (int numeroCarta, Cor corCarta, ImageIcon frenteCarta){
        this.numeroCarta = numeroCarta;
        this.corCarta = corCarta;
        this.setFrenteCarta(frenteCarta);
    }

    public int getNumeroCarta() {
        return numeroCarta;
    }

    public Cor getCorCarta() {
        return corCarta;
    }
  

}
