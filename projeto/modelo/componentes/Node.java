
package main.java.projeto.modelo.componentes;

/**
 * @param <Type>
 */
public class Node<Type> {
    private Type dado;
    private Node<Type> proximo;
    
    public Node(Type dado){
        this.dado = dado;
        this.proximo = null;
    }

    public Type getDado() {
        return dado;
    }

    public void setDado(Type dado) {
        this.dado = dado;
    }

    public Node<Type> getProximo() {
        return proximo;
    }

    public void setProximo(Node<Type> proximo) {
        this.proximo = proximo;
    }
    
    
}
