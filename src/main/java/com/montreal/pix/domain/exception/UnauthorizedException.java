package com.montreal.pix.domain.exception;

public class UnauthorizedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnauthorizedException(String mensagem) {
        super(mensagem);
    }

    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
