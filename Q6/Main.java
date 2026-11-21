package Q6;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Honda Civic", 0);

        CarroEletrico eletrico = new CarroEletrico("BYD Dolphin", 0);

        carro.acelerar();
        carro.acelerar();

        System.out.println("-");

        eletrico.acelerar();
        eletrico.acelerar();
        eletrico.carregarBateria();

    }
}