package io.number8;

import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int[] a,int[] b ,int n,int[] c ,int m){
    	
        if (a.length!= n || b.length!= n || c.length!= m) return -1;
    	
        List<String> list = new ArrayList<String>();
    	List<Integer> nails = new ArrayList<Integer>();
    	
    	int k = 0;
    	int i= 0;
    	String element = "";
    	
    	while (i < m){
    		// if the I already has all the boards attached, quit.
    		if(list.size() == n) {
    			i=m;
    		}
    		else {
	    		for (k=0; k < n ; k++)  {
	    			
	    			// if the nails fits to attach the boards.
	    			if (a[k]<=c[i] && c[i]<=b[k] ) {
    					element = String.valueOf(a[k]);
    					element = element.concat(String.valueOf(b[k]));
    					
    					// if the boards are not already attached, attach them and add the nail to the list.
	    				if(list.contains(element)==false) {
	    					list.add(element);
	    					// if the nails is not in the list, add it.
	    					if(nails.contains(c[i])==false) {
		    					nails.add(c[i]);
		    				}
	    				}
	    				
	    			}
	    		}
	    		k=0;
	    		i++;
    		}
    	}
    	
    	// if all the boards were attached, then send the result.
    	if (list.size() >= n) {
    	 return nails.size();	
    	}
    	else {
    		return -1;
    	}
    }
    
    public static void main(String[] args) {
    	/*int[] a = {1,4,5,8};
    	int[] b ={4,5,9,10};
    	int[] c = {4,6,7,10,2};*/
    	
    	/*int[] a = {1,1,1,8};
    	int[] b ={4,5,9,10};
    	int[] c = {0,2,0,3,9};*/
    	
    	
    	/*int[] a = {1,4,5,8};
    	int[] b ={4,5,9,10};
    	int[] c = {11,11,11,11,11};*/
    	
    	int[] a = {1,15,6,1};
    	int[] b ={4,17,9,11};
    	int[] c = {11,3,17,8,1};
    	
    	int n = 4;
    	int m = 5;
    	System.out.print(solution(a,b,n,c,m));
    	
    }
}