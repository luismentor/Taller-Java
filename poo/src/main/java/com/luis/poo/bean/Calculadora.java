package com.luis.poo.bean;

public class Calculadora {

	private int resultado;
	
	//metodo Getter
	public int getResultado(){
		return resultado;
	}
	
	public void sumar(int sumando1, int sumando2){
		resultado=sumando1 + sumando2;
	}
	public void restar(int minuendo1, int sustraendo2){
		resultado=minuendo1 - sustraendo2;
	}
	public void multiplicar(int numero1, int numero2){
		resultado=numero1 * numero2;
	}
	public void dividir(int numero1, int numero2){
		resultado=numero1 / numero2;
	}
	public int dimeElResultado(){
		return resultado;
	}
}
