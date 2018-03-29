package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AutoGumaTest {
	private AutoGuma g;
	
	@Before
	public void setUp() throws Exception {
		g = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		g=null;
	}

	@Test
	public void testSetMarkaModel() {
		g.setMarkaModel("Tigar");
		
		assertEquals("Tigar",g.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		g.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratakString() {
		g.setMarkaModel("Ba");
	}
	
	@Test
	public void testSetPrecnik() {
		g.setPrecnik(15);
		assertEquals(15,g.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		g.setPrecnik(9);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVece() {
		g.setPrecnik(56);
	}

	@Test
	public void testSetSirina() {
		g.setSirina(200);
		assertEquals(200,g.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		g.setSirina(95);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVece() {
		g.setSirina(700);
	}

	@Test
	public void testSetVisina() {
		g.setVisina(50);
		assertEquals(50,g.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		g.setVisina(5);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVece() {
		g.setVisina(100);
	}
	
	@Test
	public void testToString() {
		g.setMarkaModel("Tigar");
		g.setPrecnik(15);
		g.setSirina(200);
		g.setVisina(50);
		
		assertEquals("AutoGuma [markaModel=Tigar, precnik=15, sirina=200, visina=50]",g.toString());
	}
	@Test
	public void testEqualsTrue () {
		g.setMarkaModel("Sava");
		g.setPrecnik(17);
		g.setSirina(194);
		g.setVisina(60);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Sava");
		g2.setPrecnik(17);
		g2.setSirina(194);
		g2.setVisina(60);
		
		assertTrue(g.equals(g2));
	}
	
	@Test
	public void testEqualsFalse () {
		g.setMarkaModel("Sava");
		g.setPrecnik(17);
		g.setSirina(194);
		g.setVisina(60);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("Tigar");
		g2.setPrecnik(19);
		g2.setSirina(200);
		g2.setVisina(54);
		
		assertFalse(g.equals(g2));
	}
}
