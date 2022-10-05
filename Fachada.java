import java.util.Date;
import java.util.Scanner;

public class Fachada {

    Scanner sc = new Scanner(System.in);
    RepositoryProduto estoqueProduto = new RepositoryProduto();
    RepositoryLote estoqueLote = new RepositoryLote();

    public void cadastraProduto() {
        String nome = sc.nextLine();
        String fabricante = sc.nextLine();
        Double preco = sc.nextDouble();
        estoqueProduto.addProduto(new Produto(nome,fabricante,preco));

    }

    public void cadastraLote() {
        Integer quantidade = sc.nextInt();
        String dataV = sc.nextLine();
        estoqueLote.addLote(new Lote(quantidade,dataV,new Produto()));
    }

    public void listaProdutos() {
    }

    public void listaLotes() {
    }
}
