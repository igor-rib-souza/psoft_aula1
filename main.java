import java.util.Scanner;

public class main{
    public static void main(String args[]){
        Fachada fachada = new Fachada();

        Scanner sc = new Scanner(System.in);

        Boolean rodar = true;

        while(rodar){

            System.out.println("O que você deseja fazer?\n" +
                    "[1] Cadastrar um novo produto\n" +
                    "[2] Cadastrar um novo lote\n" +
                    "[3] Listar produtos\n" +
                    "[4] Listar lotes\n" +
                    "[5] Sair do sistema");

            Integer opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    fachada.cadastraProduto();
                    break;
                case 2:
                    fachada.cadastraLote();
                    break;
                case 3:
                    fachada.listaProdutos();
                    break;
                case 4:
                    fachada.listaLotes();
                    break;
                default:
                    rodar=false;
                    break;

            }

        }
    }
}