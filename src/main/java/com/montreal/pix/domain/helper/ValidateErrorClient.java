package com.montreal.pix.domain.helper;


import com.montreal.pix.domain.exception.NegocioException;
import com.montreal.pix.domain.exception.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

public class ValidateErrorClient {

    public static void getError(HttpClientErrorException e) {
        ResponseEntity<String> responseEntityErro = getBodyError(e);

        if (responseEntityErro.getStatusCode() == HttpStatus.UNAUTHORIZED) {
            throw new UnauthorizedException("Informações do login inválidas");

        } else if (responseEntityErro.getStatusCode() == HttpStatus.BAD_REQUEST) {
            throw new NegocioException("Parametros inválidos");

        }


    }


    private static ResponseEntity<String> getBodyError(HttpClientErrorException e) {
        return ResponseEntity
                .status(e.getRawStatusCode())
                .headers(e.getResponseHeaders())
                .body(e.getResponseBodyAsString());

    }

}
