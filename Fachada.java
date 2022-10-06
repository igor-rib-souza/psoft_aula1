import java.util.Date;
import java.util.Scanner;

public class Fachada {
    private final LoteServices loteServices = new LoteServices();
    private final ProdServices prodServices = new ProdServices();

    public void cadastraProduto() {
        prodServices.cadastraProduto();
    }

    public void cadastraLote() {
        loteServices.cadastraLote();
    }

    public void listaProdutos() {
    }

    public void listaLotes() {
    }
}
