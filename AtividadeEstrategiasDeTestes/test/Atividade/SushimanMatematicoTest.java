/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade;

import java.util.Arrays;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import org.junit.Test;


   public class SushimanMatematicoTest extends TestCase {
    
           /**
     * Test of ehPrimo method, of class SushimanMatematico.
     */
        @Test
	public void testEhPrimo() {
        // assert statements
        assertTrue(SushimanMatematico.ehPrimo(7));
        assertTrue(SushimanMatematico.ehPrimo(11));
        assertTrue(SushimanMatematico.ehPrimo(71));
        assertTrue(SushimanMatematico.ehPrimo(233));
        assertFalse(SushimanMatematico.ehPrimo(12));		
	}
            /**
     * Test of testGetPrimos method, of class SushimanMatematico.
     */
        @Test
	public void testGetPrimos() {
		assertEquals("getPrimos(0) deve retornar os primos de 1 digito",SushimanMatematico.getPrimos(0),Arrays.asList(2,3,5,7));
	}
        
                /**
     * Test of testGetSuperPrimos method, of class SushimanMatematico.
     */
        @Test
	public void testGetSuperPrimos() {
		fail("Not yet implemented");
	}

}

