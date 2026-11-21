package Q11;

public abstract class Produto {

    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase)
            throws PrecoInvalidoException {

        if (precoBase <= 0) {
            throw new PrecoInvalidoException(
                    "O preço deve ser maior que zero!"
            );
        }

        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}