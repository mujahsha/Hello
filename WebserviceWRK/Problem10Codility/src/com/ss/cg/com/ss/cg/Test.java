package com.ss.cg;

import java.util.ArrayList;
import java.util.List;

public class Test {

	  
	public int solution(int[] A, int[] B, int M, int X, int Y){
		int eleMove=0;
		    int i=0;
		    int startIndex=0;
		    int endIndex=0;
			while(i< A.length){
				
				int tempWeight=0;
				int tempPeople=0;
				startIndex=i;
				// To fill in lift
			while (true) {
				if (i < A.length) {
					if (Y >= tempWeight + A[i] && X >= tempPeople + 1) {
						tempWeight = tempWeight + A[i];
						tempPeople = tempPeople + 1;
						i++;
					} else
						break;
				} else break;
			}
			endIndex = i;
				
			List<Integer> l=new ArrayList<Integer>();
			// to empty lift
			for(int a=startIndex;a<endIndex;a++){
				
				if(!l.contains(B[a])){
					l.add(B[a]);
					eleMove++;
				}
				
			}
				
			eleMove++;	
			}
		
		
		
		return eleMove;
	}
	
	
	
	
}
