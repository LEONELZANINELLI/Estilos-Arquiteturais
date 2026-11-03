package Abstract_Factory;

public class InputAndroid implements Input{
    @Override
    public void renderizarInput() {
        System.out.println("Renderizando input no estilo Android.");
    }
}