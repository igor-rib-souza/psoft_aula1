import java.util.Scanner;

public class LoteServices {
    private final RepositoryLote estoqueLote = new RepositoryLote();

    Scanner sc = new Scanner(System.in);



    public void cadastraLote() {
        Integer quantidade = sc.nextInt();
        String dataV = sc.nextLine();
        estoqueLote.addLote(new Lote(quantidade,dataV,new Produto()));
    }

    public void listaServices() {
        estoqueLote.getLotes();
    }
}
