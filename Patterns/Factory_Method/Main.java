package Factory_Method;

public class Main {
    public static void main(String[] args) {
        IntNotificacoes notifacoes = new FactoryNotificacoes().criarNotificacao("email");
        notifacoes.enviar();
    }
}
