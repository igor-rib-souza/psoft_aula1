import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;

public class RepositoryProduto {
    private Map<String,Produto> estoque = new HashMap<String,Produto>();

    public void addProduto(Produto produto){
        estoque.put(produto.getName(),produto);
    }

    public void getProdutos(){
        System.out.println(estoque);
    }
}
