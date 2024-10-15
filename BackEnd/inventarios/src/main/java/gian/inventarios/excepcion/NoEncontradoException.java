package gian.inventarios.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoEncontradoException extends RuntimeException{

    public NoEncontradoException(String mensaje){
        super(mensaje);
    }
}
