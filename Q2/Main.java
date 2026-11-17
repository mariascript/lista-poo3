package Q2;

public class Main {
    public static void main(String[] args) {

        FormaGeometrica[] formas = new FormaGeometrica[3];

        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(10, 5);
        formas[2] = new Triangulo(4,8);

        for(int i = 0; i < formas.length; i++){
            System.out.println("área: " + formas[i].calcularArea());
        }
    }
}
