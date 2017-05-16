package com.ss.cg;

public class Test {
	
	public int solution(int N){
		int t[]=new int[30];
		int index=0;
		int period=-1;
		while(N>0){
			t[index]=N%2;
			N/=2;
			index++;
		}
		

        for (int p = 1; p < index; p++) {
            if (p <= index / 2) {
                boolean ok = true;
                for (int i = 0; i <  index - p; i++) {
                	System.out.println(t[i]+""+t[i+p]);
                    if (t[i] != t[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    period = p;
                }
            }
        }
		
		
		return period;
	}

}
