package Factory_Method;

public class FactoryNotificacoes {
    public IntNotificacoes criarNotificacao(String tipo){
        if (tipo.equalsIgnoreCase("email")) {
            return new EnvioEmail();
        } else if (tipo.equalsIgnoreCase("sms")){
            return new EnvioSMS();
        }

        throw new IllegalArgumentException("Notificação Inválida");
    }
}
