package com.formation.Humain;

public class Humain {
	
  private int taille;
  private int masse;
  private String nom;
  
  


public String getNom() {
	return nom;
}
public void setNom(String nom) throws Exception{
	if(!nom.matches("^(?i)[a-z]+$")) {
		throw new ChiffreException("Ne pas mettre de chiffre");
	}
	else if(!nom.matches("^[A-Z]+[a-z]+$")) {
			throw new MajException("Erreur,commencez par une majuscule");
			
		}else {this.nom = nom;
			
		}
	this.nom = nom;
}
public int getTaille() {
	return taille;
}


public void setTaille(int taille) throws Exception{
	if(taille<0) {
		throw new MinException("valeur négative") ;
	}
	this.taille = taille;
}



public int getMasse() {
	return masse;
}

public void setMasse(int masse) throws Exception {
	if(masse<0) {
		throw new MinException("valeur négative") ;
	}
	this.masse = masse;
}






public Humain(int taille, int masse, String nom) {
	super();
	this.taille = taille;
	this.masse = masse;
	this.nom = nom;
}

public Humain() {
	
	
}
  
  
  
  
  
}
