package com.example.examplejulien;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	
	
	private final RestRepository repository;

	  TestController(RestRepository repository) {
	    this.repository = repository;
	  }
	  
	  
	  @GetMapping("/julien")
	  public String index() {
			return "sa vien doucement";
		}
	  
	  
	// Aggregate root
		  // tag::get-aggregate-root[]
		  @GetMapping("/utilisateurjx")
		  List<Utilisateurj> all() {
		    return (List<Utilisateurj>) repository.findAll();
		  }
		  // end::get-aggregate-root[]

		  @PostMapping("/postUtilisateurjx")
		  Utilisateurj newEmployee(@RequestBody Utilisateurj newUtilisateurj) {
		    return repository.save(newUtilisateurj);
		  }

		  // Single item
		  
		  @GetMapping("/getUtilisateurjx/{id}")
		  Utilisateurj one(@PathVariable Long id) {
		    
		    return repository.findById(id)
		      .orElseThrow(() -> new UtilisateurjNotFoundException(id));
		  }

		  @PutMapping("/putUtilisateurjx/{id}")
		  Utilisateurj replaceUtilisateurj(@RequestBody Utilisateurj newUtilisateurj, @PathVariable Long id) {
		    
		    return repository.findById(id)
		      .map(utilisateurj -> {
		    	  utilisateurj.setUsernamex(newUtilisateurj.getUsernamex());
		    	  utilisateurj.setRole(newUtilisateurj.getRole());
		        return repository.save(utilisateurj);
		      })
		      .orElseGet(() -> {
		        newUtilisateurj.setId(id);
		        return repository.save(newUtilisateurj);
		      });
		  }
		  
		  
		  @GetMapping("/compte")
		    public Long count() {

		        return repository.count();
		    }

		  @DeleteMapping("/effaceUtilisateurjx/{id}")
		  void delete(@PathVariable String id) {
		    Long uid = Long.parseLong(id);
			  repository.deleteById(uid);
		  }















	  
	
	
	
}
