package com.ss.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {
     
	@Test
	public void testSol(){
		Solution s=new Solution();
		
		int A[]= {3,5,6,3,3,5};
		int ret=s.solution(A);
		System.out.println(ret);
		
		assertEquals(4, ret);
	}
}
