package com.example.examplejulien;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UtilisateurjNotFoundAdvice {
	@ResponseBody
	  @ExceptionHandler(UtilisateurjNotFoundException.class)
	  @ResponseStatus(HttpStatus.NOT_FOUND)
	  String UtilisateurjNotFoundHandler(UtilisateurjNotFoundException ex) {
	    return ex.getMessage();
	  }
}
