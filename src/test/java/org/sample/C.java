package org.sample;

import org.junit.Ignore;
import org.junit.Test;

public class C {
	@Test
	public void testC1() {
		System.out.println("Test C1");
     }
	
	@Test
	public void testC2() {
		System.out.println("Test C2");
     }
	@Ignore
	@Test
	public void testC3() {
		System.out.println("Test C3");
     }
}
