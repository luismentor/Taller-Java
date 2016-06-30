package com.luis.poo.bean;

public class Persona {

	public String nombre;
	public String apellido;
	public int posicion;
	
	public void caminar(int metros){
		
		posicion += metros;
	}
	
	public void cargar(Persona persona, int metros){
		posicion += metros;
		persona.posicion +=metros;
	}
}
