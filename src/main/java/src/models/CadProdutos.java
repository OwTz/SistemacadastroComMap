
package src.models;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class CadProdutos {
    Map<Long, Produto> listaDeProdutos;
    public CadProdutos(){
        this.listaDeProdutos = new HashMap<>();
    }
    public void adicionarProduto(String nome, long code, double preco, int quantidade){
        this.listaDeProdutos.put(code,new Produto(nome,code,quantidade,preco) );
       
    }
    
    public void removerProduto(long code){
        if(! this.listaDeProdutos.isEmpty()){
            this.listaDeProdutos.remove(code);
        } else {
            System.out.println("lista vfazia");
        }
    }
    public Map exibirProdutos(){
         Map<Long, Produto> listaDeProdutos = this.listaDeProdutos;
        return listaDeProdutos;
    }
    
    /* public void adicionarQuantidade(long code, int quantidade){
           this.listaDeProdutos.put(code, value);
    } */

    public double valorTotalEstoque(){
        double valorTotal = 0d;
        
        if(!this.listaDeProdutos.isEmpty()){
            for(Produto p: this.listaDeProdutos.values()){
                double valor = p.getPreco() * p.getQuantidade();
                valorTotal += valor;
            }
        }
        
  
        return valorTotal;
        
    }
    public Produto produtoMaisCaro(){
        Produto produtoCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        
        for(Produto p: this.listaDeProdutos.values()){
            
            if(p.getPreco() > maiorPreco){
                maiorPreco = p.getPreco();
                produtoCaro = p;
            }
        }
        
        return produtoCaro;
    }
     public Produto produtoMaisBarato(){
        Produto produtoCaro = null;
        double maiorPreco = Double.MAX_VALUE;
        
        for(Produto p: this.listaDeProdutos.values()){
            
            if(p.getPreco() < maiorPreco){
                maiorPreco = p.getPreco();
                produtoCaro = p;
            }
        }
        
        return produtoCaro;
    }
    
    
}
