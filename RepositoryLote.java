import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RepositoryLote {
    private Map<String,Lote> estoque = new HashMap<String,Lote>();

    public void addLote(Lote lote){
        estoque.put(lote.getValidade(),lote);
    }

    public void getLotes(){
        for (String key : estoque.keySet()){
            System.out.println(estoque.get(key).produto.name);
        }
    }
}
