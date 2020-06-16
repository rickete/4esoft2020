package AtividadeForumProgramacao2Bimestre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/livros")
public class LivroController {
    @Autowired
    private LivroRepository livros;

    @GetMapping
    public List<Livro> getAll()
    {
        return livros.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Livro getById(@PathVariable("id")UUID id ){
    	if (livros.findById(id).isPresent()) {
    		throw new LivroNaoEncontrado();
    	}
    	return livros.findById(id).get();
    	
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UUID post(@RequestBody Livro livro){
    	if(livro.getTitulo().isEmpty()){
            throw new LivroInvalido("Titulo");
        }
    	livros.save(livro);
    	return livro.getId();
        
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public UUID put(@RequestBody Livro livro, @PathVariable("id") UUID id){
        if(!id.equals(livro.getId())){
            throw new LivrosIdsDiferentes();
        }
        return livros.save(livro).getId();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public UUID delete(@PathVariable("id") UUID id){
    	if (! livros.findById(id).isPresent()) {
    		throw new LivroNaoEncontrado();
    	}
    	Livro livroParaDeletar = livros.findById(id).get();
		livros.delete(livroParaDeletar);
		return livroParaDeletar.getId();
    	
    }
}
