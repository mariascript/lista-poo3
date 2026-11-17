package Q1;

public class Main {
    public static void main(String[] args) {
        Funcionario FuncionarioClt = new FuncionarioClt("Robert Pattison", 100000);
        Funcionario FuncionarioPj = new FuncionarioPj("Daniel Craig", 50000000);

        System.out.println(FuncionarioClt.calcularSalario() );
        System.out.printf("%.2f%n", FuncionarioPj.calcularSalario());
    }
}
