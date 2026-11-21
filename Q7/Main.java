package Q7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número inteiro:");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            int num2 = sc.nextInt();

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Erro: Digite apenas números inteiros!");

        } finally {
            System.out.println("Operação encerrada.");
            sc.close();
        }
    }
}