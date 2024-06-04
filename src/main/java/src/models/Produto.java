
package src.models;


public class Produto {
    private String nome;
    private int quantidade;
    private double preco;
    private long code;

    public Produto(String nome, long code, int quantidade, double preco) {
        this.setCode(code);
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (this.code ^ (this.code >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.code == other.code;
    }

    @Override
    public String toString() {
        return "\n o produto: "+this.getNome()+ ", com código" +this.getCode()+
                "quantidade de itens "+this.getQuantidade()+ ", está com o preço" +this.getPreco();
    }

}
