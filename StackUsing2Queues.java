class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    if(!q1.isEmpty())
	    {
	        int r = q1.peek();
	        q1.remove();
	        return r;
	    }
	    return -1;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
        while(!q1.isEmpty())
        {
            int p = q1.peek();
           q2.add(p);
           q1.remove();
        }
        
        //Adding new element to q1, and pushing all elements from q1 to q2 and q2 to q1.
        q1.add(a);
        
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.remove();
        }
    }
}
