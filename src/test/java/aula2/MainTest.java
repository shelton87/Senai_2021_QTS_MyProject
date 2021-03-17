package aula2;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MainTest {

	@Test
	public void testCalculoDescontoValido() {
		
		Main objMain = new Main();
		
		float entrada = 1000;
		float saidaExperada = 20;
		float saidaPrograma = objMain.calculaDesconto(entrada);
		Assert.assertEquals(saidaExperada, saidaPrograma,0);
		
		
	}
	
	@Test
	public void testCalculoDescontoInvalido() {
		
		Main objMain = new Main();
		
		float entrada = -1;
		float saidaExperada = 0;
		float saidaPrograma = objMain.calculaDesconto(entrada);
		Assert.assertEquals(saidaExperada, saidaPrograma,0);
		
		
	}
	

}
