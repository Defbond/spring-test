package com.example.examplejulien;

public class UtilisateurjNotFoundException extends RuntimeException {
	UtilisateurjNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
