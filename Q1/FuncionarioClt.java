package Q1;

public class FuncionarioClt extends Funcionario {

    public FuncionarioClt(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + (this.salarioBase * 0.10);
    }
}