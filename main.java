public class main{
    public static void main(String args[]){
        RepositoryProduto estoqueProduto = new RepositoryProduto();
        estoqueProduto.addProduto(new Produto("ab","bc",3.55));
        estoqueProduto.getProdutos();
    }
}