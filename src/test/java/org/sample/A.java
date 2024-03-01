package org.sample;

import org.junit.Assert;
import org.junit.Test;

public class A {
	@Test
	public void testA1() {
		System.out.println("Test A1");
     }
	
	@Test
	public void testA2() {
		Assert.assertTrue("verify username",false);
		System.out.println("Test A2");
     }
	
	@Test
	public void testA3() {
		System.out.println("Test A3");
     }
	

}
