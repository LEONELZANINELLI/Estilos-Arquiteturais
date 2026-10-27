package DIP;

public class EnvioSMS implements Notificacoes {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}
