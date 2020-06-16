package AtividadeForumProgramacao2Bimestre;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(LivroNaoEncontrado.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public  void handle(LivroNaoEncontrado e){
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(LivrosIdsDiferentes.class)
    @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
    public  void handle(LivrosIdsDiferentes e){
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(LivroInvalido.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public String handle(LivroInvalido e){
        return e.getMessage();
    }

}