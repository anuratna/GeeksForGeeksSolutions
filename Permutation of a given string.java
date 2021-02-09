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
		    String s = sc.next();
		    //Sorting string.
		    char charArray[] = s.toCharArray();
		    Arrays.sort(charArray);
		    s = new String(charArray);
		    //fix would be the first part and else would be permuting.
		    String fix = "";
		    permute(fix,s);
		    System.out.println();
		}
	}
		 static void permute(String fix, String p)
		{
		    //If length is 0, then print same.
		    
		    if(p.length()==1)
		    {
		        System.out.print(fix + p + " ");
		    }
		    //if length is 2, print same and also reverse.
		    if(p.length() == 2)
		    {
		        System.out.print(fix + p + " ");
                String sn = p.charAt(1) + "" + p.charAt(0);
                System.out.print(fix + sn + " ");
		    }
		    if(p.length()>2)
		    {
		        for(int i=0;i<p.length();i++)
		        {
		            //ith as fix character.
		            String f = fix + p.charAt(i);
		            //including charcater before the fixed one and also all the chars after the fixed one.
		            String remain = p.substring(0,i) + p.substring(i+1,p.length());
		            permute(f,remain);
		        }
		        
		    }
		    
		}
		
	
}
