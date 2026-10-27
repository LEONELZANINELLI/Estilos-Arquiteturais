package OCP;

public class PagamentoPix extends Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pago por pix");;        
    }
}
