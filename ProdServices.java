import java.util.Scanner;

public class ProdServices {

    private final RepositoryProduto estoqueProduto = new RepositoryProduto();
    Scanner sc = new Scanner(System.in);

    public void cadastraProduto() {
        String nome = sc.nextLine();
        String fabricante = sc.nextLine();
        Double preco = sc.nextDouble();
        estoqueProduto.addProduto(new Produto(nome,fabricante,preco));
    }
}
