

package src;
import src.models.CadProdutos;

public class SistemaDeCadastroMap {

    public static void main(String[] args) {
        CadProdutos lista = new CadProdutos();
        
        lista.adicionarProduto("arroz", 1111, 22, 1);
        lista.adicionarProduto("feijao", 1113, 12, 10);
        lista.adicionarProduto("pipa", 1113, 2, 10);
        
        System.out.println(lista.exibirProdutos());
        System.out.println("o produto mais caro é: " +lista.produtoMaisCaro().getNome()+" com valor de: "
        +lista.produtoMaisCaro().getPreco());
        System.out.println("o produto mais barato é: " +lista.produtoMaisBarato().getNome()+" com valor de: "
        +lista.produtoMaisBarato().getPreco());
        System.out.println("\n quantidade total no estoque: "+lista.valorTotalEstoque());
        
    }
}
