package AtividadeForumProgramacao2Bimestre;

public class LivroNaoEncontrado extends RuntimeException{
    public LivroNaoEncontrado() {
        super("Livro não foi encontrado");
    }
}
