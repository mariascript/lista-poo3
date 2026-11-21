package Q8;

public class Main {

    public static void main(String[] args) {

        try {
            Produto p1 = new Produto("Notebook", 3500, 5);
            p1.exibirProduto();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("        ");

        try {
            Produto p2 = new Produto("", 1500, 3);
            p2.exibirProduto();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("-");

        try {
            Produto p3 = new Produto("Mouse", -50, 10);
            p3.exibirProduto();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("-");

        try {
            Produto p4 = new Produto("Teclado", 200, -2);
            p4.exibirProduto();

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}