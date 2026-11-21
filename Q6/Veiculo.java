package Q6;

public abstract class Veiculo {

    private String modelo;
    private double velocidadeAtual;

    public Veiculo(String modelo, double velocidadeAtual) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar();

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}