package Q4;

public class PagamentoCartao implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão: R$ " + valor);
    }
}