package com.luis.console.main;

import java.io.Console;

public class LecturaConConsola {

	public static void main(String[] args){
		Console consola = System.console();
		System.out.println("Ingresa tu nombre: ");
		String nombre = consola.readLine();
		System.out.println("Ingresa tu apellido: ");
		String apellido = consola.readLine();
		System.out.println("Ingresa tu edad: ");
		int edad=Integer.parseInt(consola.readLine());
		
		System.out.println("Ingrese su password");
		char[] password = consola.readPassword();
		String passwordStr = new String(password);
		
		System.out.printf("Su nombre es %s , su apellido es %s y su edad es %d a\u00f1os", nombre , apellido , edad );
		System.out.println("Su pasword es: "+passwordStr);
	}
}
