package Q4;

public class PagamentoBoleto implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Boleto: R$ " + valor);
    }
}