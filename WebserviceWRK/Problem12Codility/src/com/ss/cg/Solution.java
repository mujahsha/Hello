package com.ss.cg;

public class Solution {
	
	public int solution(String s){
		s.trim();
		int longestPassword=-1,tempLen=0;
		char c; boolean valid=false;
		for(int i=0;i<s.length();i++){
			c=s.charAt(i);
			int intVal=c;
			if(intVal< 48 || intVal > 57 ){
				tempLen++;
				if(intVal>=65 && intVal <=90){
					valid=true;
				}
				
			} 
			
			if( (intVal>=48 && intVal <=57 ) || i==s.length()-1){
				
				if(tempLen >0 && valid){
					if(longestPassword< tempLen){
						longestPassword=tempLen;
					}
					
					valid=false;
				}
				tempLen=0;	
			}
			
			
			
			
		}
		
		
		return longestPassword;
	}

}
