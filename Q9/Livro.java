package Q9;

public class Livro {

    private String titulo;
    private int exemplaresDisponiveis;

    public Livro(String titulo, int exemplaresDisponiveis) {
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public void emprestar() throws LivroIndisponivelException {

        if (exemplaresDisponiveis <= 0) {
            throw new LivroIndisponivelException("Livro indisponível para empréstimo!");
        }

        exemplaresDisponiveis--;

        System.out.println("Empréstimo realizado!");
        System.out.println("Exemplares disponíveis: " + exemplaresDisponiveis);
    }
}