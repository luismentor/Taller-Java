package com.luis.ejercicio08.main;
import java.util.Scanner;

public class CalcularPromedio {

	
	/*
	public void Mostrar(){
		System.out.println("El nombre del alumno es: "+nombres[1]);
		System.out.println("La nota del alumno es: "+notas[1]);
	}*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroAlumnos=3;
		String nombres[] = new String[3];
		int notas[] = new int[3];
		
		for(int i=0 ; i<numeroAlumnos; i++){
		
		System.out.println("Ingresar el nombre del alumno 01: "+(i+1));
		nombres[i] = sc.nextLine();
		System.out.println("ingresar nota: \n"+(i+1));
		notas[i] = sc.nextInt();
		sc.nextLine();
		}
		for(int i=0; i<numeroAlumnos; i++){
			System.out.format("El nombre del alumno 1 es %s  y su nota es %d \n", nombres[i], notas[i]);
		}

		sc.close();
	}
	
}
