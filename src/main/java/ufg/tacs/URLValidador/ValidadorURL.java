package ufg.tacs.URLValidador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorURL {
    
    public boolean validadorDeUrl(String url){
    	boolean resultado = false;
    	
      //protocolo de comunicação  
      Pattern protocol = Pattern.compile("http");
      Matcher protocolo = protocol.matcher(url);
      
      //rede mundial
      Pattern host = Pattern.compile("www");
      Matcher rede = host.matcher(url);
      
      //endereco de dominio
      Pattern domain = Pattern.compile("[a-z]{5,}.\\w{3,3}");
      Matcher endereco = domain.matcher(url);
      
      //paginas do endereco
      Pattern path = Pattern.compile("/[a-z]+/");
      Matcher caminho = path.matcher(url);
      
      //parametros
      Pattern parameter = Pattern.compile("[a-z]+=[a-z]+");
      Matcher parametros = parameter.matcher(url);
     
     if (parametros.find() && caminho.find() && endereco.find() && rede.find() && protocolo.find()){
         
    	 resultado = true;
         
     } else resultado = false;
     
     return resultado;
    }
    
}