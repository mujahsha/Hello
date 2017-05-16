package com.ss.cg;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
	
	
	@org.junit.Test
	public void evaluateSolution(){
	
		int A[][]={{0,1,9,3},{7,5,8,8},{9,2,9,4},{4,4,7,1}		
		};
		
		Test t=new Test();
		int retval=t.solution(A);
		System.out.println(retval);
		assertEquals(2, retval);
		
	}

}
