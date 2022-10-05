import java.util.Date;
public class Lote {
    Integer quantidade;
    String dataV;
    Produto produto;

    public Lote (Integer quantidade, String dataV, Produto produto){
        this.quantidade=quantidade;
        this.dataV=dataV;
        this.produto=produto;
    }

    public String getValidade() {
        return this.dataV;
    }
}