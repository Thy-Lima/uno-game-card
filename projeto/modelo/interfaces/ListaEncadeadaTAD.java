
package main.java.projeto.modelo.interfaces;

/**
 * @param <Type>
 */

public interface ListaEncadeadaTAD<Type> {
    
    public boolean estaVazia();
    public int tamanho();
    public void adicionar(Type item);
    public Type mostrarPorIndice(int indice);
    
}
