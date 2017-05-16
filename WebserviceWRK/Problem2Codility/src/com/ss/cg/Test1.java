package com.ss.cg;

public class Test1 {
	
	
	public int solution(InList L){
		int len=0;
		if(L==null){
			return len;
		} 
		len++;
		while(L.next!=null){
			len++;
			L=L.next;
		}
		return len;
	}

}
