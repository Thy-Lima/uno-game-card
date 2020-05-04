
package main.java.projeto.modelo.estruturas;
import java.util.Random;
import main.java.projeto.modelo.interfaces.PilhaTAD;
import main.java.projeto.modelo.componentes.Node;

/**
 * @param <Type>
 */

public class PilhaPrincipal<Type> implements PilhaTAD<Type> {
    
    private Node<Type> topo;
    
    public PilhaPrincipal(){
        this.topo = null;
    }

    @Override
    public void adicionar(Type item) {
        Node novoNode = new Node (item);
        novoNode.setProximo(null);
        
        if(this.estaVazia()){
            this.topo = novoNode;
        }else{
            Node ultimo = this.topo;
            while(ultimo.getProximo() != null){
                ultimo = ultimo.getProximo();
            }
            
            ultimo.setProximo(novoNode);
        }
    }

    @Override
    public void embaralhar() {
        Type auxiliar = null;
        Random sorteio = new Random();
        int valorSorteado;
     
        Node nodeInicial = this.topo;
        Node nodeFinal = this.topo;
        
        do{
            valorSorteado = sorteio.nextInt(108);
             
        }while(valorSorteado < 70 || valorSorteado > 108);
        
        for(int i = 0; i < valorSorteado; i++){
            int primeiroNode;
            int segundoNode;
            
            do{
                primeiroNode = sorteio.nextInt(108);
                segundoNode = sorteio.nextInt(108);
                
            }while(primeiroNode < 0 || primeiroNode > 108 || segundoNode < 0 || segundoNode > 108);
            
            for(int j = 0; j < primeiroNode; j++){
                nodeInicial = nodeInicial.getProximo();
            }
            
            for(int k = 0; k < segundoNode; k++){
                nodeFinal = nodeFinal.getProximo();
            }
            
            auxiliar = (Type) nodeInicial.getDado();
            nodeInicial.setDado(nodeFinal.getDado());
            nodeFinal.setDado(auxiliar);
            nodeInicial = this.topo;
            nodeFinal = this.topo;    
        }  
    }

    @Override
    public Type remover() {
        Node temporario = this.topo;
        this.topo = temporario.getProximo();
        Type auxiliar = (Type) temporario.getDado();
        temporario = null;
        
        return auxiliar;
    }

    @Override
    public boolean estaVazia() {
        return this.topo == null;
    }
    
   
    
}
