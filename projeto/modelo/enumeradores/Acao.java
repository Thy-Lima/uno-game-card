
package main.java.projeto.modelo.enumeradores;


public enum Acao {
    BLOQUEAR(1), INVERTER(2), COMPRAR_DUAS(3), COMPRAR_QUATRO(4), MUDAR_COR(5);
    
    public int valor;
    
    Acao(int valor){
        this.valor = valor;
    } 
}
