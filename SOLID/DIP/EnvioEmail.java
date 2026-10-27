package DIP;

public class EnvioEmail implements Notificacoes {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}
