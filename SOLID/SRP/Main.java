public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Clean code", "Thiago");

        CriarLivro criar = new CriarLivro();
        RelatorioLivro exibir = new RelatorioLivro();
        
        criar.salvar(livro);
        exibir.exibir(livro);
    }
}
