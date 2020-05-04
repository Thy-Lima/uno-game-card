
package main.java.projeto.modelo.enumeradores;


public enum Cor {
    AMARELO(1), VERMELHO(2), AZUL(3), VERDE(4), PRETA(5);
    
    public int valor;
    
    Cor(int valor){
        this.valor = valor;
    }
}
