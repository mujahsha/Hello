package com.ss.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {
	

	@Test
	public void testSolution(){
		Solution sol=new Solution();
		String s="a0Ba4sssGhhh2";
		int actual=sol.solution(s);
		System.out.println(actual);
		assertEquals(7, actual);
		
	}

}
