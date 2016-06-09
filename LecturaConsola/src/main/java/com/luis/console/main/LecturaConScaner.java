package com.luis.console.main;

import java.util.Scanner;

public class LecturaConScaner {
	
	public static void main(String[] args){
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Ingresa tu apellido: ");
		String apellido = sc.nextLine();
		System.out.println("Ingrese su edad: ");
		int edad = sc.nextInt();
		System.out.printf("Su nombre es %s , su apellido es %s y su edad es %d a\u00f1os", nombre , apellido , edad );
	}

}
