package com.ss.cg;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
	
	@org.junit.Test
	public void TestSolution(){
	
	/*int M=5;
	int X=2;
	int Y=200;
	
	int A[]={60,80,40};
	int B[]={2,3,5};*/
		
    int M=3,X=5,Y=200;
    int A[]={40,100,80,20};
    int B[]={3,2,2,3};
	Test t=new Test();
	int count=t.solution(A, B, M, X, Y);
	System.out.println(count);
	assertEquals(6, count);
		
	}

}
