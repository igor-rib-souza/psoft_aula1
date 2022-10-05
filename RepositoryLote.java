import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RepositoryLote {
    private Map<Date,Lote> estoque = new HashMap<Date,Lote>();

    public void addLote(Lote lote){
        estoque.put(lote.getValidade(),lote);
    }

    public void getLotes(){
        System.out.println(estoque);
    }
}
