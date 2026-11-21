package Q4;

public class Main {

    public static void main(String[] args) {

        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoPix();
        pagamentos[1] = new PagamentoCartao();
        pagamentos[2] = new PagamentoBoleto();

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(100.00);
        }
    }
}