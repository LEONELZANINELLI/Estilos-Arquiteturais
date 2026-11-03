
package Abstract_Factory;

import java.util.Map;
import java.util.Locale;
import java.util.function.Supplier;

public class FactoryRegistry {

    private static final Map<String, Supplier<Fabrica>> factories =
            Map.of(
                    "ios", FabricaIOS::new,
                    "android", FabricaAndroid::new
            );

    public static Fabrica obterFactory(String tipo) {

        Supplier<Fabrica> criador =
                factories.get(tipo.toLowerCase(Locale.ROOT));

        if (criador == null) {
            throw new IllegalArgumentException(
                    "Plataforma não suportada: " + tipo
            );
        }

        return criador.get();
    }
}
