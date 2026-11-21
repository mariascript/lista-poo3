package Q4;

public class PagamentoPix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via PIX: R$ " + valor);
    }
}