package com.luis.utilitario.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.luis.utilitario.util.StringUtil;

//@Ignore("No quiero probar")
public class StringUtilTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("--> beforeClass()");
	}
	@AfterClass
	
	public static void afterClass(){
		System.out.println("--> afterClass()");
	}
	
	@Before
	public void before(){
		//System.out.println("-->before each test");
	}
	@After
	public void after(){
		//System.out.println("--> after each test");
	}

	@Test
	//@Ignore
	public void capitalizeTest() { // los Metodos del test deben ser vacios
		assertEquals(StringUtil.capitalize("java"), "Java");
		assertNull(StringUtil.capitalize(null));
		assertEquals(StringUtil.capitalize(""), "");
	}

	@Test
	public void timesTest() {
		assertTrue(StringUtil.times("hola ", 2).equals("hola hola "));
		assertEquals(StringUtil.times("", 2), "");
		assertNull(StringUtil.times(null, 2));
	}

	@Test
	public void reverseTest() {
		System.out.println("truncateTest()");
		assertTrue(StringUtil.reverse("hola").equals("aloh"));
		assertEquals(StringUtil.reverse(""), "");
		assertNull(StringUtil.reverse(null));
	}

	@Test
	public void swapCaseTest() {
		assertTrue(StringUtil.swapCase("java").equals("JAVA"));
		assertNull(StringUtil.capitalize(null));
		assertEquals(StringUtil.capitalize(""), "");
	}

	@Test
	public void capitalizeAllWordsTest() {
		assertTrue(StringUtil.capitalizeAllWords(" hola  mundo").equals(" Hola  Mundo"));
		assertEquals(StringUtil.capitalizeAllWords(""), "");
		assertNull(StringUtil.capitalizeAllWords(null));
	}
	
	@Test
	public void assertSameAndEqualsTest(){
		String cadena1 ="java";
		String cadena2 ="java";
		String cadena3 = new String("java");
		assertSame(cadena1,cadena2); // ==
		assertSame(cadena1,cadena2); // equals
		assertSame(cadena2,cadena3);// ==
		assertSame(cadena2,cadena3);// equals
	}

}
