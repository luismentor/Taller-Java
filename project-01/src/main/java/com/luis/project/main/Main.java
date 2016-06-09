package com.luis.project.main;
import com.luis.utilitario.util.StringUtil;

public class Main {
	
	public static void main(String[] args) {
		
		
		String nombres[] = {"juLio", "MarCos", "roBerto", "LUIS"};
		
		for (String nombre : nombres){
			System.out.println(StringUtil.capitalize(nombre));
		}
	}
}