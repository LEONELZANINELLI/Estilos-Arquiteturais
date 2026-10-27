package DIP;

public class Notificador {
    private Notificacoes notificacoes;

    public Notificador(Notificacoes notificacoes){
        this.notificacoes = notificacoes;
    }

    public void alertarAtualizacao(String mensagem){
        notificacoes.enviarNotificacao(mensagem);
    }
}
