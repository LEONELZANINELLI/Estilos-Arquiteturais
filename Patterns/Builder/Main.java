package Builder;

public class Main {
    public static void main(String[] args) {
        Casa casa = new CasaBuilder()
            .telhado("Madeira")
      
            .build();
        System.out.println(casa);
    }
}
