package ufg.tacs.URLValidador;

import org.junit.Test; 

import junit.framework.TestCase;

public class ValidadorURLTest extends TestCase  {
    
	/*
    @Test
    public void testUrlFacebook() {
    	
        String url = "http://www.facebook.com/userAsigor";
        ValidadorURL instance = new ValidadorURL();
        
        boolean resultExperado = true;
        boolean resultObtido = instance.validadorDeUrl(url);
        
        assertEquals(resultExperado, resultObtido);
    }

    @Test
    public void testUrlInstagram() {
    	
        String url = "http://www.instagram.com/phothos/userAsjoao";
        ValidadorURL instance = new ValidadorURL();
        
        boolean resultExperado = true;
        boolean resultObtido = instance.validadorDeUrl(url);
        
        assertEquals(resultExperado, resultObtido);
    }  
	*/
	
    @Test
    public void testUrlComDominioDeRedeInvalido() {
    	
        String url = "http://ww1.facebook.com/phothos/=joao";
        ValidadorURL instance = new ValidadorURL();
        boolean resultExperado = false;
        boolean resultObtido = instance.validadorDeUrl(url);
        
        assertEquals(resultExperado, resultObtido);
    } 
    
}

