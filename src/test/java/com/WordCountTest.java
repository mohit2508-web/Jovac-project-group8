package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class WordCountTest {

	WordCountService wcs = new WordCountService();
	String s1 = "This is string 1";
	String s2 = "This string has more number of letters";
	String s3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String s4 = "12345678910";
	String s5 = " This has more          spaces";

	@Test
	public void testLetter1() {
	Assertions.assertEquals(12, wcs.LetterCount(s1));
	}
	@Test
	public void testLetter2() {
	Assertions.assertEquals(32, wcs.LetterCount(s2));
	}
	@Test
	public void testLetter3() {
	Assertions.assertEquals(26, wcs.LetterCount(s3));
	}
	@Test
	public void testLetter4() {
	Assertions.assertEquals(0, wcs.LetterCount(s4));
	}
	@Test
	public void testNumber1() {
	Assertions.assertEquals(1, wcs.NumberCount(s1));
	}
	@Test
	public void testNumber2() {
	Assertions.assertEquals(0, wcs.NumberCount(s2));
	}
	@Test
	public void testNumber3() {
	Assertions.assertEquals(11, wcs.NumberCount(s4));
	}
	@Test
	public void testSpace1() {
	Assertions.assertEquals(3, wcs.SpaceCount(s1));
	}
	@Test
	public void testSpace2() {
	Assertions.assertEquals(0, wcs.SpaceCount(s4));
	}
	@Test
	public void testSpace3() {
	Assertions.assertEquals(13, wcs.SpaceCount(s5));
	}
	
	
	
	

}
