package AtividadeForumProgramacao2Bimestre;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Livro {

    @Id
    private UUID id;
    private String titulo;
    private int numeroDePaginas;
    private String autor;
    
    public Livro(String titulo, int numeroDePaginas, String autor) {
    	this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
    }
    
    public String getAutor() {
		return autor;
	}
    
     public UUID getId() {
		return id;
	}
    
     public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
     
    public String getTitulo() {
		return titulo;
	}
    
    
    
    
}