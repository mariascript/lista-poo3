package Q1;

public class FuncionarioPj extends Funcionario {

    public FuncionarioPj(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    @Override
    public double calcularSalario() {
        return this.salarioBase - (this.salarioBase * 0.05);
    }

}
