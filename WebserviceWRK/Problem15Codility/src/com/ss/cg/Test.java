package com.ss.cg;

public class Test {

	
	public int solution(String s){
		
		int k=s.length()/2; int lb=0,ob=0;
		for(int i=0;i< s.length();i++){
		    
			int p=0;
			lb=0;
			ob=0;
		   while(p<=k){
			   if(s.charAt(p)=='('){
				   lb++;
			   }
			   p++;
		   }
		   int q=k+1;
		   while(q<s.length()){
			   if(s.charAt(q)==')'){
				   ob++;
			   } 
			   q++;
		   }
		   
		   if(lb==ob){
			   break;
		   } else if(lb>ob){
			   k=k-1;
		   } else k=k+1;
		}
		
		return k+1;
		
		
	}
}
