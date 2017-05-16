package com.ss.cg;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
	
	@org.junit.Test
	public void testSolution(){
		Test t=new Test();
		int retVal=t.solution("((())()))))(");
		System.out.println(retVal);
		assertEquals(7, retVal);
	}

}
