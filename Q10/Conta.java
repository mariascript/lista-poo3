package Q10;

public class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void transferir(Conta destino, double valor)
            throws SaldoInsuficienteException {

        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }

        if (destino == null) {
            throw new IllegalArgumentException("A conta de destino não pode ser nula!");
        }

        if (saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transferência!");
        }

        saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Valor transferido: R$ " + valor);
    }

    public void exibirSaldo() {
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: R$ " + saldo);
    }
}