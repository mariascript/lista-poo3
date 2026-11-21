package Q10;

public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta(1001, 1000);
        Conta conta2 = new Conta(1002, 500);

        try {
            conta1.transferir(conta2, 300);

        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("            ");

        try {
            conta1.transferir(conta2, 2000);

        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("         ");

        try {
            conta1.transferir(conta2, -100);

        } catch (SaldoInsuficienteException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("      ");

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}