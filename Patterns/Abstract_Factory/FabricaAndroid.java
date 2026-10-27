package Abstract_Factory;

public class FabricaAndroid implements Fabrica {

    @Override
    public Botao criarBotao() {
        return new BotaoAndroid();
    }

    @Override
    public Input criarInput() {
        return new InputAndroid();
    }
}
