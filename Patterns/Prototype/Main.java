package Prototype;

public class Main {
    public static void main(String[] args) {
        Contrato contrato = new Contrato(
            "Padrão", 
            "CLT",
            15000.00
        );

        System.out.println(contrato);

        Contrato contratoJoao = (Contrato) contrato.clone();
        contratoJoao.setNome("João");
        System.out.println(contratoJoao);
    }
}
