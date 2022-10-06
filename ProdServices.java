import java.util.Scanner;

public class ProdServices {

    private final RepositoryProduto estoqueProduto = new RepositoryProduto();
    Scanner sc = new Scanner(System.in);

    public void cadastraProduto() {
        System.out.println("Insira o nome do produto");
        String nome = sc.nextLine();
        System.out.println("Insira o nome do fabricante");
        String fabricante = sc.nextLine();
        System.out.println("Insira o preço do produto");
        Double preco = sc.nextDouble();
        estoqueProduto.addProduto(new Produto(nome,fabricante,preco));
    }

    public void listaProdutos() {
        estoqueProduto.getProdutos();
    }
}
