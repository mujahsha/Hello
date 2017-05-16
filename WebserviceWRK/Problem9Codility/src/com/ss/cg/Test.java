package com.ss.cg;

public class Test {
	
	public int solution(int[][] A){
		int saddlePoint=0;
		int colMin,colMax=0;
		int index=0;
		for(int i=0;i<A.length;i++){
		    colMin=A[i][0];index=0;
			for(int j=1;j<A[i].length;j++){
				if(colMin> A[i][j]){
					colMin=A[i][j];
					index=j;
				}
				
			}
			int k=0;
			for( k=0;k<A.length;k++){
				if(colMin< A[k][index]){
					break;
				}
			}
			if(k== A.length){
				saddlePoint++;
			}
			
		}
		
		
		for(int i=0;i<A.length;i++){
		    colMax=A[i][0];index=0;
			for(int j=1;j<A[i].length;j++){
				if(colMax< A[i][j]){
					colMax=A[i][j];
					index=j;
				}
				
			}
			int k=0;
			for( k=0;k<A.length;k++){
				if(colMax > A[k][index]){
					break;
				}
			}
			if(k== A.length){
				saddlePoint++;
			}
			
		}
		return saddlePoint;
	}

}
