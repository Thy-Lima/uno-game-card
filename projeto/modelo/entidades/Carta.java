
package main.java.projeto.modelo.entidades;

import javax.swing.ImageIcon;


public abstract class Carta {
    private ImageIcon frenteCarta;
    private final ImageIcon versoCarta = new ImageIcon(getClass().getResource("/main/java/projeto/visao/imagens/versocarta.jpg"));

    
    
    public ImageIcon getFrenteCarta() {
        return frenteCarta;
    }

    public void setFrenteCarta(ImageIcon frenteCarta) {
        this.frenteCarta = frenteCarta;
    }

    public ImageIcon getVersoCarta() {
        return versoCarta;
    }
    
}
