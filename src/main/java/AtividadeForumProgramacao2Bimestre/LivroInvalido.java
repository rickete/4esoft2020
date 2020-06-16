package AtividadeForumProgramacao2Bimestre;

public class LivroInvalido extends RuntimeException{
	public LivroInvalido(String livro) {
        super("Livro inválido:" + livro);
    }
}
