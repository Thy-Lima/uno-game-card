
package main.java.projeto.modelo.estruturas;
import main.java.projeto.modelo.interfaces.ListaEncadeadaTAD;
import main.java.projeto.modelo.componentes.Node;


/**
 * @param <Type>
 */

public class DeckJogador<Type> implements ListaEncadeadaTAD<Type>{
    private Node<Type> cabeca;
    
    public DeckJogador(){
        this.cabeca = null;
    }
    
    @Override
    public boolean estaVazia() {
        return this.cabeca == null;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;
        
        if(this.estaVazia()){
            return tamanho;
            
        }else{
            tamanho++;
            Node ultimo = this.cabeca;
            
            while(ultimo.getProximo() != null){
                tamanho++;
                ultimo = ultimo.getProximo();
            }
        }
        return tamanho;
    }

    @Override
    public void adicionar(Type item) {
        Node novoNode = new Node(item);
        novoNode.setProximo(null);
        
        if(this.estaVazia()){
            this.cabeca = novoNode;
        
        }else{
            Node ultimo = this.cabeca;
            while(ultimo.getProximo() != null){
                ultimo = ultimo.getProximo();
            }
            
            ultimo.setProximo(novoNode);
        }
    }

    @Override
    public Type mostrarPorIndice(int indice) {
        Type auxiliar = null;
        
        if(!(this.estaVazia()) && indice <= this.tamanho()){
            int tam = 1;
            
            Node ultimo = this.cabeca;
             while(tam < indice){
                 tam++;
                 
                 ultimo = ultimo.getProximo();
             }
             
             auxiliar = (Type) ultimo.getDado();
        }
        return auxiliar;
    }
}
