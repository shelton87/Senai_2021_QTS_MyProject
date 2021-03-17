package aula4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidadorCPFTest {

	ValidadorCPF valCPF = new ValidadorCPF();
	
	@Test
	public void testValidadorCPFvalido() {

		Assert.assertEquals(true, valCPF.cpfValido(1));
		
	}	
	
	@Test
	public void testValidadorCPFinvalido() {

		Assert.assertEquals(false, valCPF.cpfValido(0));
		
	}

}
