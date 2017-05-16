package com.ss.cg;

public class Test {
	
	
	
	public int solution(int A,int B){
		int bitCount=0;
		
		int mul=A*B;
		
		while(mul>0){
			if(mul%2!=0){
				bitCount++;
			}
			mul/=2;
		}
		
		return bitCount;
	}

}
