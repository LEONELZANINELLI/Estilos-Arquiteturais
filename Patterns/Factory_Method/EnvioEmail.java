package Factory_Method;

public class EnvioEmail implements Notificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por Email...");
    }
}