package Q8;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser vazio!");
        }

        if (preco <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero!");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa!");
        }

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}