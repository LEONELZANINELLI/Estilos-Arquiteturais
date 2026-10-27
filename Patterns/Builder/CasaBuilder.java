package Builder;

public class CasaBuilder {
    private String telhado;
    private boolean portas;
    private boolean estrutura;

    public CasaBuilder telhado(String telhado){
        this.telhado = telhado;
        return this;
    }

    public CasaBuilder portas(boolean portas){
        this.portas = portas;
        return this;
    }

    public CasaBuilder estrutura(boolean estrutura){
        this.estrutura = estrutura;
        return this;
    }

    public Casa build(){
        return new Casa(telhado, portas, estrutura);
    }
}
