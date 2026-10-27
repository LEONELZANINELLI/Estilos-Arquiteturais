package Abstract_Factory;

public class FabricaIOS implements Fabrica {
    @Override
    public Botao criarBotao() {
        return new BotaoIOS();
    }

    @Override
    public Input criarInput() {
        return new InputIOS();
    }
}
