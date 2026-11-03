package Factory_Method;

public class FactorySMS {
    public Notificacoes criarNotificacao() {
        return new EnvioSMS();
    }
}