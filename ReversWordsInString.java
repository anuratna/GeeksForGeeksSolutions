/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		  String str = sc.next();
		  String strArray[] = str.split("[.]");
		  for(int j=strArray.length-1;j>=0;j--)
	      {
		     if(j==0){
		         System.out.print(strArray[j]);}
		     else
		        {
		        System.out.print(strArray[j]+".");
		        }
		   
		    }
		     System.out.print("\n");
		}
  
	}
}
