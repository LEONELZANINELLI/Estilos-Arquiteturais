
package Abstract_Factory;

public class Main {
    public static void main(String[] args) {

        String tipo = "Android";

        Fabrica factory = FactoryRegistry.obterFactory(tipo);

        Aplicacao app = new Aplicacao(factory);

        app.renderizar();
    }
}
