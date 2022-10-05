public class Produto {
    String name;
    String fabricante;
    Double preco;

    public Produto(String name, String fabricante, Double preco){
        this.name=name;
        this.fabricante=fabricante;
        this.preco=preco;
    }

    public Produto() {
        this.name=null;
        this.fabricante=null;
        this.preco=null;
    }

    public String getName() {
        return this.name;
    }

    public void getProduto(){
        System.out.println(name);
    }
}