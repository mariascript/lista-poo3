package Q5;

public class Main {

    public static void main(String[] args) {

        Televisao tv = new Televisao();
        Roteador roteador = new Roteador();
        Computador computador = new Computador();

        tv.ligar();
        tv.desligar();

        System.out.println();

        roteador.ligar();
        roteador.conectarInternet();
        roteador.desligar();

        System.out.println();

        computador.ligar();
        computador.conectarInternet();
        computador.desligar();
    }
}