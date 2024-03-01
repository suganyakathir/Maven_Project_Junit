package org.sample;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {
	@Test
	public void testB1() {
		Assert.assertTrue("verify username",true);
		System.out.println("Test B1");
     }
	
	@Test
	public void testB2() {
		System.out.println("Test B2");
     }
	@Ignore
	@Test
	public void testB3() {
		System.out.println("Test B3");
     }

}
