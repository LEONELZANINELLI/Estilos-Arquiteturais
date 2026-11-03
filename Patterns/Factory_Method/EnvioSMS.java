package Factory_Method;

public class EnvioSMS implements Notificacoes {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS...");
    }
}