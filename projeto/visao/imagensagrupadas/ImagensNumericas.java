
package main.java.projeto.visao.imagensagrupadas;
import javax.swing.ImageIcon;

public class ImagensNumericas {
    private final String caminho = "/main/java/projeto/visao/imagens/";
    private final String extensao = ".jpg";
    private ImageIcon [] amarelas;
    private ImageIcon [] azuis;
    private ImageIcon [] verdes;
    private ImageIcon [] vermelhas;
    
    public ImagensNumericas(){
        this.amarelas = new ImageIcon[20];
        this.azuis = new ImageIcon[20];
        this.verdes = new ImageIcon[20];
        this.vermelhas = new ImageIcon[20];
        
        this.alocarImagensAmarelas();
        this.alocarImagensAzuis();
        this.alocarImagensVerdes();
        this.alocarImagensVermelhas();
    }
    
    private void alocarImagensAmarelas(){
        String corImagem = "amarela";
        
        int j = 9;
        
        for(int i = 0; i < 20; i++){
            this.amarelas [i] = new ImageIcon(getClass().getResource(caminho + corImagem + j + extensao));
            j--;
            
            if(j == -1){
                j = 9;
            }
        }
    }
    
    private void alocarImagensAzuis(){
        String corImagem = "azul";
        
        int j = 9;
        
        for(int i = 0; i < 20; i++){
            this.azuis [i] = new ImageIcon(getClass().getResource(caminho + corImagem + j + extensao));
            j--;
            
            if(j == -1){
                j = 9;
            }
        }
    }
    
    private void alocarImagensVerdes(){
        String corImagem = "verde";
        
        int j = 9;
        
        for(int i = 0; i < 20; i++){
            this.verdes [i] = new ImageIcon(getClass().getResource(caminho + corImagem + j + extensao));
            j--;
            
            if(j == -1){
                j = 9;
            }
        }
    }
    
    private void alocarImagensVermelhas(){
        String corImagem = "vermelha";
        
        int j = 9;
        
        for(int i = 0; i < 20; i++){
            this.vermelhas [i] = new ImageIcon(getClass().getResource(caminho + corImagem + j + extensao));
            j--;
            
            if(j == -1){
                j = 9;
            }
        }
    }
    
    
    public ImageIcon obterAmarelas(int indice){
        return this.amarelas[indice];
    }
    
    public ImageIcon obterAzuis(int indice){
        return this.azuis[indice];
    }
    
    public ImageIcon obterVerdes(int indice){
        return this.verdes[indice];
    }
    
    public ImageIcon obterVermelhas(int indice){
        return this.vermelhas[indice];
    }
    
}
