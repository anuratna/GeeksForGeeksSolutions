/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i<t; i++)
		{
		    String str = in.next();
		    while(true){
    		    String s ="";
	    	    boolean flag = false;
        	    for(int j=0; j<str.length();j++)
        	    {
        			flag = false;
        			if(j+1==str.length())s+=str.charAt(j);
        	        for(int k = j+1;k<str.length();k++)
        	        {
        	            if(str.charAt(j)!=str.charAt(k))
        	            {
        					if(!flag){
        						s+=str.charAt(j);
        					}
        					flag = false;
        	                j=k-1;
        					break;
        	            }
        				flag = true;
        	        }
        	        if(flag){
        	            break;
        	        }
        	        
        	    }
        	    if(str.equals(s))break;
        	    str = s;
        	        
		    }
           System.out.print(str);
           System.out.println();
		 }
	}
}
