package Factory_Method;

public class Main {
    static void main(String[] args) {
        Notificacoes notificacoes = new FactoryNotificacoes().criarNotificacao("email");
        notificacoes.enviar();

        notificacoes = new FactoryNotificacoes().criarNotificacao("sms");
        notificacoes.enviar();

        notificacoes = new FactorySMS().criarNotificacao();
        notificacoes.enviar();

        notificacoes = new FactoryEmail().criarNotificacao();
        notificacoes.enviar();
    }
}