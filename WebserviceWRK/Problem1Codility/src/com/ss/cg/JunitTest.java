package com.ss.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {
	
	@Test
	public void testSolution(){
		
		Test1 t=new Test1();
		
		int A[]={0,1,3,-2,0,1,0,-3,2,3};
		
		int res=t.solution(A);
	    System.out.println(res);
	    assertEquals(4, res);
	
	}

}
