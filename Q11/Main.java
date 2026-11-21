package Q11;

public class Main {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[2];
        ProdutoDigital digital = null;


        try {
            produtos[0] = new ProdutoFisico("Notebook", 3500);

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            digital = new ProdutoDigital("E-book", 100);
            produtos[1] = digital;

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("PREÇOS DOS PRODUTOS");

        for (int i = 0; i < produtos.length; i++) {

            if (produtos[i] != null) {
                System.out.println("Produto: " + produtos[i].getNome());

                System.out.println(
                        "Preço final: R$ " +
                                produtos[i].calcularPrecoFinal()
                );

                System.out.println("---");
            }
        }

        if (digital != null) {
            System.out.println("DESCONTO DO PRODUTO DIGITAL");

            double desconto = digital.aplicarDesconto(10);

            System.out.println("Preço com desconto: R$ " + desconto);
        }

        System.out.println("  ");

        try {
            ProdutoFisico invalido = new ProdutoFisico("Mouse", 0);

        } catch (PrecoInvalidoException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }
}