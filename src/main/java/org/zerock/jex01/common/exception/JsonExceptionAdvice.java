package org.zerock.jex01.common.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
@Log4j2
public class JsonExceptionAdvice extends AccessDeniedHandlerImpl {

    /*
    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> exceptionHandler(HttpServletRequest request){

        log.error("=================================");
        log.error("=================================");
        log.error("=================================");
        log.error("=================================");
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("ACCESS ERROR");
    }

     */

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {

        log.error("--------------------JsonExceptionAdvice---------------------------");
        log.error("-----------------------------------------------");
        log.error("-----------------------------------------------");
        log.error("----------------------" + request.getContentType() + "-------------------------");

        if (request.getContentType() != null) {

        } else {
            super.handle(request, response, accessDeniedException);
        }
    }
}
