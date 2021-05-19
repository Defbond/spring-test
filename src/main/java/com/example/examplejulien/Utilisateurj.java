package com.example.examplejulien;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateurj {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String usernamex;
	
	private String passwordx;
	

	private int role;
	
	private int numtel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsernamex() {
		return usernamex;
	}

	public void setUsernamex(String usernamex) {
		this.usernamex = usernamex;
	}

	public String getPasswordx() {
		return passwordx;
	}

	public void setPasswordx(String passwordx) {
		this.passwordx = passwordx;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public int getNumtel() {
		return numtel;
	}

	public void setNumtel(int numtel) {
		this.numtel = numtel;
	}
	
	
	@Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Utilisateurj))
	      return false;
	    Utilisateurj utilisateurj = (Utilisateurj) o;
	    return Objects.equals(this.id, utilisateurj.id) && Objects.equals(this.usernamex, utilisateurj.usernamex)
	        && Objects.equals(this.passwordx, utilisateurj.passwordx) && Objects.equals(this.role, utilisateurj.role)
	        && Objects.equals(this.numtel, utilisateurj.numtel);
	  }

	  @Override
	  public int hashCode() {
		  return Objects.hash(this.id,this.usernamex,this.passwordx,this.role,this.numtel);
	  }

	@Override
	public String toString() {
		return "Utilisateurj [id=" + id + ", usernamex=" + usernamex + ", passwordx=" + passwordx + ", role=" + role
				+ ", numtel=" + numtel + "]";
	}
	  
	  

	  
	
	
}
