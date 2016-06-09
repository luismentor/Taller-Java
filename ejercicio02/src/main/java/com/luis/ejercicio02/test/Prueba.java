package com.luis.ejercicio02.test;

import com.luis.utilitario.util.StringUtil;

public class Prueba {
	
	public static void main(String[] args){
		
		System.out.println(StringUtil.truncate("hola", 3));
		System.out.println(StringUtil.truncate("java", 10));
		System.out.println(StringUtil.truncate("universidad", 3));
		System.out.println(StringUtil.truncate("laptop", 6));
	}

}
