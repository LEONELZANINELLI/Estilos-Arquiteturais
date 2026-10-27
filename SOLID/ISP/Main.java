package ISP;

public class Main {
    public static void main(String[] args) {
        Bibliotecario bibliotecario = new Bibliotecario();
        bibliotecario.gerenciarLivro();

        Administrador adm = new Administrador();
        adm.gerenciarLivro();
        adm.gerenciarUsuario();
        adm.emitirRelatorio();
    }
}
