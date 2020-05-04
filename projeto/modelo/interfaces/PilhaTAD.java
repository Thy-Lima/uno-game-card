
package main.java.projeto.modelo.interfaces;

/**
 * @param <Type>
 */

public interface PilhaTAD<Type> {
    
    public void adicionar(Type item);
    public void embaralhar();
    public Type remover();
    public boolean estaVazia();
    
}
