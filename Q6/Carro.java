package Q6;

public class Carro extends Veiculo {

    public Carro(String modelo, double velocidadeAtual) {
        super(modelo, velocidadeAtual);
    }

    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 10);

        System.out.println("Carro: " + getModelo());
        System.out.println("Velocidade: " + getVelocidadeAtual() + " km/h");
    }
}