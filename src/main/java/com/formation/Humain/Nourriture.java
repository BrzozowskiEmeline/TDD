package com.formation.Humain;

public class Nourriture {
	
	private String nom;
	private int calories;
	

	
	
	
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
					
	}
	
	
	
	public int getCalories() {
		return calories;
	}
	
	
	
	
	public void setCalories(int calories)throws Exception {
		if(calories<0) {
			throw new IllegalArgumentException("Valeur négative");	
		}
		this.calories = calories;
	}
	
	
	
	
	
	
	public Nourriture(String nom, int calories) {
		this.nom = nom;
		this.calories = calories;
	}
	
	public Nourriture() {
		
	}
	

}
