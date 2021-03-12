class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    int k =0;
    /* The method insert to push element
       into the queue */
    void Push(int B)
	{
		s1.push(B);
		
	}
	
	int Pop()
	{
	    
	    if(s2.isEmpty())
	    {
	        if(s1.isEmpty())
	        {
	            return -1;
	        }
	        
	        while(!s1.isEmpty())
	        {
	             s2.push(s1.pop());
	             
	        }
	        
	         k = s2.peek();
	         s2.pop();
	         
	         while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
	       return k; 
	    }
	    
	    else
	    {
	        return -1;
	    }
	    	
	}

}
