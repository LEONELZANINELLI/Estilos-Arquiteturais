package ISP;

public class Administrador implements IntAdmin, IntBibliotecario {
    public void gerenciarUsuario(){
        System.out.println("Usuario");
    }
    public void emitirRelatorio(){
        System.out.println("Relatorio");
    }
    public void gerenciarLivro(){
        System.out.println("Livro");
    }
}
