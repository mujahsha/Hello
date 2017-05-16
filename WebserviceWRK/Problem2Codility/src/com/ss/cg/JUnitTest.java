package com.ss.cg;

import static org.junit.Assert.assertEquals;

public class JUnitTest {

	
	@org.junit.Test
	public void evaluateSolution(){
		
		InList l1=new InList();
		InList l2=new InList();
		InList l3=new InList();
		InList l4=new InList();
		InList l5=new InList();
		l1.value=1;
		l1.next=l2;
		l2.value=2;
		l2.next=l3;
		l3.value=3;
		l3.next=l4;	
		l4.value=4;
		l4.next=l5;
		l5.value=5;
		l5.next=null;
		
		Test1 t1= new Test1();
		int ret=t1.solution(l1);
		System.out.println(ret);
		assertEquals(5,ret);
		
	}
}
