import java.util.Date;
public class Lote {
    Integer quantidade;
    Date dataV;
    Produto produto;

    public Lote (Integer quantidade, Date dataV, Produto produto){
        this.quantidade=quantidade;
        this.dataV=dataV;
        this.produto=produto;
    }

    public Date getValidade() {
        return this.dataV;
    }
}