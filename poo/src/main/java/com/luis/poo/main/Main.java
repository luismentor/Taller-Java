package com.luis.poo.main;
import com.luis.poo.bean.Persona;
public class Main {

	public static void main(String[] args) {
		Persona juan = new Persona();
		juan.nombre="Juan";
		juan.apellido="Rosas";
		juan.posicion = 0;
		
		Persona pedro = new Persona();
		pedro.nombre = "pedro";
		pedro.apellido = "Arias";
		pedro.posicion=0;
		
		juan.caminar(5);
		pedro.caminar(10);
		
		System.out.println("Juan esta en la posicion: "+juan.posicion);
		System.out.println("Pedro esta en la posicion: "+pedro.posicion+"\n");
		
		juan.cargar(pedro, 5);
		System.out.println("Juan cargando a Pedro");
		System.out.println("Juan esta en la posicion: "+ juan.posicion);
		System.out.println("Juan esta en la posicion: "+ juan.posicion);
	}
	
}
