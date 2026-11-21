package Q6;

public class CarroEletrico extends Veiculo implements Eletrico {

    public CarroEletrico(String modelo, double velocidadeAtual) {
        super(modelo, velocidadeAtual);
    }

    @Override
    public void acelerar() {
        setVelocidadeAtual(getVelocidadeAtual() + 15);

        System.out.println("Carro elétrico: " + getModelo());
        System.out.println("Velocidade: " + getVelocidadeAtual() + " km/h");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria do carro elétrico!");
    }
}