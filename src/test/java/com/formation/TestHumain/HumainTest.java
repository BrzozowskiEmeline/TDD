package com.formation.TestHumain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.formation.Humain.ChiffreException;
import com.formation.Humain.Humain;
import com.formation.Humain.MajException;
import com.formation.Humain.MinException;

public class HumainTest {

	
	private Humain humain;
	
	@Before
	public void set() throws Exception {
		humain = new Humain();
		humain.setNom("Luc");
		humain.setTaille(120);
		humain.setMasse(20);
	}
	
	@Test
	public void humain() throws Exception{
		humain = new Humain(120,20,"Luc");
		assertEquals(humain.getNom(),"Luc");
		assertEquals(humain.getTaille(), 120);
		assertEquals(humain.getMasse(),20);
				
	}
	
	
	
	@Test(expected=MajException.class)
	public void testSetNom() throws Exception {
		humain.setNom("luc");
		//assertNotEquals(humain.getNom(), "luc");
	}
	@Test(expected=ChiffreException.class)
	public void testSetNomChiffre() throws Exception {
		humain.setNom("444545jkjkjhk");
		}
	
	
	
	
	@Test(expected=MinException.class)
	public void testSetTaille() throws Exception{
		humain.setTaille(-120);
	} 
	
	
	@Test
	public void testGetTaille() {
		
	}
	
	@Test
	public void testGetMasse() {
	}
	
	@Test(expected=MinException.class)
	public void testSetMasse() throws Exception{
		humain.setMasse(-5);
//		assertEquals(humain.getMasse(),-5);
	}
	

	
	

	
}
