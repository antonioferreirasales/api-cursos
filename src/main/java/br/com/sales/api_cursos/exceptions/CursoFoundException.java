package br.com.sales.api_cursos.exceptions;

public class CursoFoundException extends RuntimeException {
    public CursoFoundException() {
        super("Curso já existe.");
    }
}
