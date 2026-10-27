package OCP;

public class PagamentoBoleto extends Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagar Boleto ");
    }
}
