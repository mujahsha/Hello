package com.ss.cg;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int A[]={0,1,2,2,3,5};
		int B[]={500000,500000,0,0,0,20000};
				
				 Test t=new Test();
				 t.solution(A, B);
				  
		
	}
	public int solution(int[] A, int[] B){
		
		int mupCount=0;
		
	   List<Double> l=new ArrayList<Double>();
		
		for(int i=0 ;i< A.length; i++){
			double temp=(double)B[i]/1000000;
			l.add(A[i]+temp);
			
		}
		
		for (int p = 0; p < l.size() - 1; p++) {

			for (int q = p + 1; q < l.size(); q++) {

				if ((l.get(p) * l.get(q)) >= (l.get(p) + l.get(q))) {
					mupCount++;
				}
			}

		}
	    System.out.println(mupCount);
		return mupCount;
	
}
}

