package aula4;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ValidadorIdadeTeste {

	ValidadorIdade valIdade = new ValidadorIdade();
	
	@Test
	public void testValidadorIdadeValido() {

		int entrada = 19;
		boolean saidaEsperada = true;
		boolean saidaPrograma = valIdade.eMaiorIdade(entrada);
		Assert.assertEquals(saidaEsperada, saidaPrograma);
		
	}
	
	@Test
	public void testValidadorIdadeInvalido() {

		Assert.assertEquals(false, valIdade.eMaiorIdade(18));
		
	}

}
