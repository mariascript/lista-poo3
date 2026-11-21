package Q9;

public class Main {

    public static void main(String[] args) {

        Livro livro = new Livro("Revolução dos Bichos", 2);

        for (int i = 0; i < 3; i++) {

            try {
                livro.emprestar();

            } catch (LivroIndisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        }
    }
}