package com.ss.cg;

public class Solution {
	
	
	public int solution(int[] A){
		
		int idParir=0;
		
		for(int i=0;i< A.length;i++){
			
			for(int j=i+1;j< A.length;j++){
				if(A[i]==A[j]){
					idParir++;
					System.out.print("("+i+" "+j+") ");
				}
			}
			
		}
		
		
		return idParir;
				
	}

}
