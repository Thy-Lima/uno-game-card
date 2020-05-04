
package main.java.projeto.visao.imagensagrupadas;
import javax.swing.ImageIcon;

        
public class ImagensEspeciais {
    private final String caminho = "/main/java/projeto/visao/imagens/";
    private final String extensao = ".jpg";
    private ImageIcon [] bloquearAmarela;
    private ImageIcon [] bloquearAzul;
    private ImageIcon [] bloquearVerde;
    private ImageIcon [] bloquearVermelha;
    private ImageIcon [] inverterAmarela;
    private ImageIcon [] inverterAzul;
    private ImageIcon [] inverterVerde;
    private ImageIcon [] inverterVermelha;
    private ImageIcon [] comprar2Amarela;
    private ImageIcon [] comprar2Azul;
    private ImageIcon [] comprar2Verde;
    private ImageIcon [] comprar2Vermelha;
    private ImageIcon [] comprar4;
    private ImageIcon [] mudarCor;
    
    public ImagensEspeciais() {
        this.bloquearAmarela = new ImageIcon[2];
        this.bloquearAzul = new ImageIcon[2];
        this.bloquearVerde = new ImageIcon[2];
        this.bloquearVermelha = new ImageIcon[2];
        this.inverterAmarela= new ImageIcon[2];
        this.inverterAzul = new ImageIcon[2];
        this.inverterVerde = new ImageIcon[2];
        this.inverterVermelha = new ImageIcon[2];
        this.comprar2Amarela= new ImageIcon[2];
        this.comprar2Azul = new ImageIcon[2];
        this.comprar2Verde = new ImageIcon[2];
        this.comprar2Vermelha = new ImageIcon[2];
        this.comprar4 = new ImageIcon[4];
        this.mudarCor = new ImageIcon[4];
        
        this.alocarBloquearAmarelas();
        this.alocarBloquearAzuis();
        this.alocarBloquearVerdes();
        this.alocarBloquearVermelhas();
        this.alocarInverterAmarelas();
        this.alocarInverterAzuis();
        this.alocarInverterVerdes();
        this.alocarInverterVermelhas();
        this.alocarComprar2Amarelas();
        this.alocarComprar2Azuis();
        this.alocarComprar2Verdes();
        this.alocarComprar2Vermelhas();
        this.alocarComprar4();
        this.alocarMudarCor();
    }
    
    private void alocarBloquearAmarelas(){
        String corImagem = "amarelaBloquear";
        
        for(int i = 0; i < 2; i++){
            this.bloquearAmarela[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarBloquearAzuis(){
        String corImagem = "azulBloquear";
        
        for(int i = 0; i < 2; i++){
            this.bloquearAzul[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarBloquearVerdes(){
        String corImagem = "verdeBloquear";
        
        for(int i = 0; i < 2; i++){
            this.bloquearVerde[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarBloquearVermelhas(){
        String corImagem = "vermelhaBloquear";
        
        for(int i = 0; i < 2; i++){
            this.bloquearVermelha[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }

    private void alocarInverterAmarelas(){
        String corImagem = "amarelaInverter";
        
        for(int i = 0; i < 2; i++){
            this.inverterAmarela[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarInverterAzuis(){
        String corImagem = "azulInverter";
        
        for(int i = 0; i < 2; i++){
            this.inverterAzul[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarInverterVerdes(){
        String corImagem = "verdeInverter";
        
        for(int i = 0; i < 2; i++){
            this.inverterVerde[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarInverterVermelhas(){
        String corImagem = "vermelhaInverter";
        
        for(int i = 0; i < 2; i++){
            this.inverterVermelha[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarComprar2Amarelas(){
        String corImagem = "amarelaComprar2";
        
        for(int i = 0; i < 2; i++){
            this.comprar2Amarela[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }

    private void alocarComprar2Azuis(){
        String corImagem = "azulComprar2";
        
        for(int i = 0; i < 2; i++){
            this.comprar2Azul[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarComprar2Verdes(){
        String corImagem = "verdeComprar2";
        
        for(int i = 0; i < 2; i++){
            this.comprar2Verde[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarComprar2Vermelhas(){
        String corImagem = "vermelhaComprar2";
        
        for(int i = 0; i < 2; i++){
            this.comprar2Vermelha[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarComprar4(){
        String corImagem = "comprar4";
        
        for(int i = 0; i < 4; i++){
            this.comprar4[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    
    private void alocarMudarCor(){
        String corImagem = "mudarCor";
        
        for(int i = 0; i < 4; i++){
            this.mudarCor[i] = new ImageIcon(getClass().getResource(caminho + corImagem + extensao));
        }
    }
    

    public ImageIcon obterBloquearAmarelas(int indice){
        return this.bloquearAmarela[indice];
    }
    
    public ImageIcon obterBloquearAzuis(int indice){
        return this.bloquearAzul[indice];
    }
    
    public ImageIcon obterBloquearVerdes(int indice){
        return this.bloquearVerde[indice];
    }
    
    public ImageIcon obterBloquearVermelhas(int indice){
        return this.bloquearVermelha[indice];
    }
    
    public ImageIcon obterInverterAmarelas(int indice){
        return this.inverterAmarela[indice];
    }
    
    public ImageIcon obterInverterAzuis(int indice){
        return this.inverterAzul[indice];
    }
    
    public ImageIcon obterInverterVerdes(int indice){
        return this.inverterVerde[indice];
    }
    
    public ImageIcon obterInverterVermelhas(int indice){
        return this.inverterVermelha[indice];
    }
    
    public ImageIcon obterComprar2Amarelas(int indice){
        return this.comprar2Amarela[indice];
    }
    
    public ImageIcon obterComprar2Azuis(int indice){
        return this.comprar2Azul[indice];
    }
    
    public ImageIcon obterComprar2Verdes(int indice){
        return this.comprar2Verde[indice];
    }
    
    public ImageIcon obterComprar2Vermelhas(int indice){
        return this.comprar2Vermelha[indice];
    }
    
    public ImageIcon obterComprar4(int indice){
        return this.comprar4[indice];
    }
    
    public ImageIcon obterMudarCor(int indice){
        return this.mudarCor[indice];
    }

}

