package Builder;

public class Casa {
    private String telhado;
    private boolean portas;
    private boolean estrura;

    public Casa(String telhado, boolean portas, boolean estrutra){
        this.telhado = telhado;
        this.portas = portas;
        this.estrura = estrutra;
    }
    
    @Override 
    public String toString(){
        return "Casa{"+
        "telhado: " + telhado
        + "portas: " + portas
        + "estrutura: " + estrura + "}";
    }

}
