package Q3;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor);
}