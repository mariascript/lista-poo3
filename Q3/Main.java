package Q3;

public class Main {

    public static void main(String[] args) {

        ContaBancaria contaCorrente = new ContaCorrente("Maria", 1000);
        ContaBancaria contaPoupanca = new ContaPoupanca("Kamis", 2000);

        contaCorrente.depositar(500);
        contaCorrente.sacar(100);

        contaPoupanca.depositar(300);
        contaPoupanca.sacar(100);

        System.out.println("Saldo Conta Corrente: R$ " + contaCorrente.saldo);
        System.out.println("Saldo Conta Poupança: R$ " + contaPoupanca.saldo);
    }
}