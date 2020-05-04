
package main.java.projeto.visao.mesa;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;


public class Mesa extends JPanel {
    
    public Mesa(){
        super();
        setSize(1200, 1320);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon(getClass().getResource("/main/java/projeto/visao/imagens/Mesa.jpg"));
        Image novaImg = img.getImage();
        g.drawImage(novaImg, 0, 0, this);
        
    }
    
}
