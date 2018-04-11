package com.formation.TestHumain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.formation.Humain.ChiffreException;
import com.formation.Humain.MajException;
import com.formation.Humain.Nourriture;

public class NourritureTest {

	
	private Nourriture nourriture;
	
	@Before
	public void set() throws Exception{
		nourriture = new Nourriture();
		nourriture.setNom("Pomme");
		nourriture.setCalories(20);
	}
	
	
	@Test // tester avec le before 
	public void nourriture() {
		//assertEquals(nourriture.getNom(),"lait");
		assertEquals(nourriture.getNom(),"Lait");
		//assertNotEquals(nourriture.getNom(),"lait");
		
	}
	
	

		
	
	
	@Test(expected=MajException.class)
	public void testSetNomMaj() throws Exception {
		nourriture.setNom("lait");
		
	}

	@Test(expected=ChiffreException.class)
	public void testSetNomChiffre() throws Exception {
		nourriture.setNom("444545jkjkjhk");
		}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testSetCalories() throws Exception {
		Nourriture N2 = new Nourriture("lait", 120);
		N2.setCalories(-2);
		
	}

}
