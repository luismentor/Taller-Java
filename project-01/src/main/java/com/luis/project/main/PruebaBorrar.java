package com.luis.project.main;

public class PruebaBorrar {
	
	public static void main(String[] args) {
	
		//Pool String
		String saludo="hola";   
		String cadena="hola";
		
		//La memoria
		String cad1=new String("hola");
		String cad2=new String("hola");
		
		
		String message = (saludo == cadena) ? "true" : "false";  // Este es el OPERADOR TERNARIO
		//System.out.println(message);
		
		boolean result = (cad1 == cad2) ? true : false;  // operador ternario con boleano
		System.out.println(result);
		
		System.out.println((saludo == cad1) ? true : false);  // Sale false
		
		System.out.println((saludo.equals(cad1)) ?true:false);  // el equals compara objetos
	}

}