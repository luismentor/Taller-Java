package com.luis.utilitario.util;

import java.lang.Character.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.omg.CORBA.portable.ValueOutputStream;

/**
 * Clase con metodos complementarios para la clase string
 * 
 * @see java.lang.String
 * @author Luis Enrique
 * @since 1.0
 */

public class StringUtil {
	/**
	 * Retorna una cadena con el primer caracter en mayuscula y lo demas en
	 * minuscula
	 * <p>
	 * Example <blockquote>
	 * 
	 * <pre>
	 * 
	 * StringUtil.capitalize("luis")  returns  "Mauro"
	 * &#64;since 1.0
	 * </pre>
	 * 
	 * </blockquote>
	 *
	 * Este metodo es para capitalizar palabras
	 * 
	 * @param source:
	 *            Palabra a capitalizar
	 * @return: Retorna la palabra capializada
	 */

	public static String capitalize(String source) { // source nombre de retorno
		if(source==null || source.isEmpty()){
			return source;
		}
		String primerCaracter = source.substring(0, 1);
		String demasCaracteres = source.substring(1);
		primerCaracter = primerCaracter.toUpperCase();
		demasCaracteres = demasCaracteres.toLowerCase();
		return primerCaracter + demasCaracteres;

	}

	/**
	 * @since 1.1
	 * @param cadena
	 * @param numCaracteres
	 * @return
	 */
	public static String truncate(String cadena, int numCaracteres) {

		if (numCaracteres >= cadena.length()) {
			return cadena;
		}

		String frase = cadena.substring(0, numCaracteres);
		return frase;
	}

	public static String swapCase(String cadena) {
		String resultado = "";
		char palabra;
		for (int i = 0; i < cadena.length(); i++) {
			char x = cadena.charAt(i);

			if (Character.isUpperCase(x)) {
				palabra = Character.toLowerCase(x);
			} else {
				palabra = Character.toUpperCase(x);
			}
			resultado += palabra;
		}

		return resultado;

	}

	public static void main(String[] args) {
		// System.out.println(StringUtil.swapCase("java"));
		// System.out.println(StringUtil.swapCase("JAVA"));
		// System.out.println(StringUtil.swapCase("jAvA"));
		// System.out.println(StringUtil.swapCase(null));

		// System.out.println(times("hola ", 2));
		// System.out.println(times("* - ", 3));

		// System.out.println(reverse("hola"));
		// System.out.println(reverse("java"));
		// System.out.println(reverse("*"));

		System.out.println(capitalizeAllWords("hola muNdo"));

	}

	public static String times(String cadena, int numeroDeVeces) {
		if(cadena==null){
			return cadena;
		}
		String resultado = "";
		for (int i = 0; i < numeroDeVeces; i++) {
			resultado += cadena;
		}
		return resultado;
	}

	public static String reverse(String cadena) {
		if(cadena==null){
			return null;
		}
		String resultado = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			char a = cadena.charAt(i);
			resultado += a;
		}
		return resultado;
	}

	public static String capitalizeAllWords(String cadena) {
		if(cadena==null){
			return cadena;
		}

		boolean esInicioDePalabra = true;
		String resultado = "";
		boolean esInicioPalabra;
		for (int i = 0; i < cadena.length(); i++) {
			if (esInicioDePalabra) {
				char mayuscula = Character.toUpperCase(cadena.charAt(i));
				resultado += mayuscula;
			} else {
				char minuscula = Character.toLowerCase(cadena.charAt(i));
				resultado += minuscula;
			}
			if (Character.isWhitespace(cadena.charAt(i))) {
				esInicioDePalabra = true;
			} else {
				esInicioDePalabra = false;
			}
		}
		return resultado;
	}

}
