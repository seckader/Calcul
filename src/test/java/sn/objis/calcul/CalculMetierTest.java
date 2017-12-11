package sn.objis.calcul;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {

	private CalculMetier calcul;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		calcul = new CalculMetier();
	}

	public void testSomme() {
		assertTrue(calcul.somme(4, 5) == 9);
	}
	
	public void testProduit() {
		assertTrue(calcul.produit(4.0, 5.0) == 20.0);
	}

}
