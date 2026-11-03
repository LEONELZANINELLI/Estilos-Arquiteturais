package Factory_Method;

public class FactoryNotificacoes {
    public Notificacoes criarNotificacao(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new EnvioEmail();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new EnvioSMS();
        } else {
            throw new IllegalArgumentException("Tipo de notificação inválido: " + tipo);
        }
    }
}