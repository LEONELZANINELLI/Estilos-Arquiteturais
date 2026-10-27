package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        String tipo = "android";

        if(tipo.equals("ios")){
            Fabrica fabricaIOS = new FabricaIOS();

            Botao btnIOS = fabricaIOS.criarBotao();
            Input inputIOS = fabricaIOS.criarInput();

            btnIOS.renderizarBotao();
            inputIOS.renderizarInput();

        }else if (tipo.equals("android")){
            Fabrica fabricaAndroid = new FabricaAndroid();

            Botao btnAndroid = fabricaAndroid.criarBotao();
            Input inputAndroid = fabricaAndroid.criarInput();

            btnAndroid.renderizarBotao();
            inputAndroid.renderizarInput();
        }

    }
}
