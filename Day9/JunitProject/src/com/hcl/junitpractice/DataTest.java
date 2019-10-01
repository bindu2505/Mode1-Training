package com.hcl.junitpractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testsayHello() {
		Data objdata =new Data();
		assertEquals("welcome to junit", objdata.sayHello());
	}
	
	@Test
	public void testsum(){
		Data objdata =new Data();
		assertEquals(4, objdata.sum(2, 2));
		assertEquals(4, objdata.sum(1, 3));
	}
	
	@Test
	public void testmax3(){
		Data objdata =new Data();
		assertEquals(5, objdata.max3(5, 1, 3));
		assertEquals(5, objdata.max3(1, 5, 3));
		assertEquals(5, objdata.max3(1, 3, 5));
	}
	
	@Test
	public void testminArray(){
		Data objdata =new Data();
		int[] a=new int[]{2,3,4,5};
		int[] a1=new int[]{12,23,94,5};
		assertEquals(5,objdata.minArray(a1));
	}
	
	@Test
	public void testeven(){
		Data objdata =new Data();
		assertTrue(objdata.even(10));
		assertFalse(objdata.even(13));
	}
	
	@Test
	public void testgetPropertyTest(){
		Data objdata =new Data();
		assertNotNull(objdata.getPropertyTest("bindu"));
		assertNull(objdata.getPropertyTest("priya"));
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void testdivEx(){
		Data objdata =new Data();
		objdata.div(5, 0);
	}
	
	@Test
	public void testdiv(){
		Data objdata =new Data();
		assertEquals(2, objdata.div(5, 2));
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullEx(){
		Data obj = null;
		assertEquals(5, obj.sum(3, 2));
	}
	

	
}
