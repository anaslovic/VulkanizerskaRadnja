package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja vr;
	private AutoGuma g;
	
	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();

		g = new AutoGuma();
		g.setMarkaModel("Michelin");
		g.setPrecnik(15);
		g.setSirina(200);
		g.setVisina(50);
	}

	@After
	public void tearDown() throws Exception {
		vr=null;
		g=null;

	}
	
	@Test
	public void testDodajGumu() {
		vr.dodajGumu(g);
		assertEquals(g,vr.getGume().getFirst());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuPostojeca() {
		vr.dodajGumu(g);

		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Michelin");
		g2.setPrecnik(15);
		g2.setSirina(200);
		g2.setVisina(50);
		
		vr.dodajGumu(g2);
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
	}


	@Test
	public void testPronadjiGumu() {
		vr.dodajGumu(g);
		assertEquals(g,vr.pronadjiGumu("Michelin").get(0));
	}
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null,vr.pronadjiGumu(null));
	}
	
	@Test
	public void testPronadjiGumuNePostoji() {
		vr.dodajGumu(g);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Tigar");
		g2.setPrecnik(16);
		g2.setSirina(212);
		g2.setVisina(55);
		vr.dodajGumu(g2);
		
		assertEquals(null,vr.pronadjiGumu("Sava"));
	}
	
	@Test
	public void testPronadjiGumuRazliciteDimenzije() {
		vr.dodajGumu(g);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Michelin");
		g2.setPrecnik(16);
		g2.setSirina(212);
		g2.setVisina(55);
		vr.dodajGumu(g2);
		
		assertEquals(2,vr.pronadjiGumu("Michelin").size());
	}

}
