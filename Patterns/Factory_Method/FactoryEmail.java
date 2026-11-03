package Factory_Method;

public class FactoryEmail {
    public Notificacoes criarNotificacao() {
        return new EnvioEmail();
    }
}