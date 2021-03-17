package aula4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidadorNameTest {

	ValidadorName valName = new ValidadorName();
	
	@Test
	public void testNameValido() {

		Assert.assertEquals(true, valName.nameValido("a"));
		
	}
	
	@Test
	public void testNameInvalido() {

		Assert.assertEquals(false, valName.nameValido(""));
		
	}

}
