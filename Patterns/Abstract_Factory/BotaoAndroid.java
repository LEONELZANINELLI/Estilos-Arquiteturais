package Abstract_Factory;

public class BotaoAndroid implements Botao{
    @Override
    public void renderizarBotao() {
        System.out.println("Renderizando botão no estilo Android.");
    }
}