package Prototype;

public class Contrato implements ContratoPrototype {
    private String nome;
    private String tipo;
    private double valor;

    public Contrato(String nome, String tipo, double valor){
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    @Override
    public ContratoPrototype clone(){
        return new Contrato(this.nome, this.tipo, this.valor);
    }

    @Override 
    public String toString(){
        return "Contrato{"+
        "nome: " + nome
        + " tipo: " + tipo
        + " valor: " + valor 
        + "}";
    }




}
