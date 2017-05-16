package com.ss.cg;

import static org.junit.Assert.assertEquals;

public class JUnitTest {

	@org.junit.Test
	public void checkSol(){
		Test t=new Test();
		int ret=t.solution(3, 7);
		System.out.println(ret);
		assertEquals(3, ret);
		
	}
}
