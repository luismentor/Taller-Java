package com.luis.utilitario.test;

import static org.junit.Assert.*;


import org.junit.Test;

import com.luis.utilitario.util.StringUtil;


public class StringUtilTest {

	@Test
	public void capitalizeTest() {  // los Metodos del test deben ser vacios
		assertEquals(StringUtil.capitalize("java"), "Java");
		assertNull(StringUtil.capitalize(null));
		assertEquals(StringUtil.capitalize(""), "");
	}
	@Test
	public void timesTest(){
		assertTrue(StringUtil.times("hola ", 2).equals("hola hola "));
		assertEquals(StringUtil.times("", 2), "");
		assertNull(StringUtil.times(null, 2));
	}
	@Test
	public void reverseTest(){
		assertTrue(StringUtil.reverse("hola").equals("aloh"));
		assertEquals(StringUtil.reverse(""), "");
		assertNull(StringUtil.reverse(null));
	}
	@Test
	public void swapCaseTest(){
		assertTrue(StringUtil.swapCase("java").equals("JAVA"));
		assertNull(StringUtil.capitalize(null));
		assertEquals(StringUtil.capitalize(""), "");
	}
	@Test
	public void capitalizeAllWordsTest(){
		assertTrue(StringUtil.capitalizeAllWords(" hola  mundo").equals(" Hola  Mundo"));
		assertEquals(StringUtil.capitalizeAllWords(""), "");
		assertNull(StringUtil.capitalizeAllWords(null));
	}
	
	
}
