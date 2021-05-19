package com.example.examplejulien;

@SuppressWarnings("serial")
public class UtilisateurjNotFoundException extends RuntimeException {
	UtilisateurjNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }
}
