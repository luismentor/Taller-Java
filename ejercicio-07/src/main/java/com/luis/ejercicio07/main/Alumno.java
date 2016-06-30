package com.luis.ejercicio07.main;

import java.util.Scanner;


//import org.omg.Messaging.SyncScopeHelper;

public class Alumno {

	public String nombre;
	public String apellido;
	int nota1, nota2, nota3;
	double promedio;

	public double damePromedio(int[] notas){
		double sumaNotas=00;
		 for(int nota : notas){
			 sumaNotas += nota;
		 } return sumaNotas / notas.length;
	}
	/*
	public String Mensaje(String mensaje){
		if(promedio<=10){
			System.out.println("Alumno REPROBADO");
		} else {
			System.out.println("Alumno APROBADO");
		} return mensaje;
	} */
	
public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingresa tu apellido: ");
		String apellido = sc.nextLine();
		
		
		System.out.println("ingresar notas: ");
		
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();

	}

}
