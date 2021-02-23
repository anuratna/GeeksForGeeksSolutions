class solver
{
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        boolean flag = false;
        Node slow = head;
        Node fast = head;
         
        //Detect loop using floyde's algo
        while(fast !=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                flag = true;
                break;
                //System.out.print("Loop Detected");
            }
        }
        //If loop is detected, set one pointer(slow) to head and second(fast) to the point where loop is detected and inc both by 1,
        //if slow and fast next are same, set the fast.next to null to break loop.
        if(flag == true){
            
         slow = head;
         while(slow.next != fast.next)
         {
             slow = slow.next;
             fast = fast.next;
         }
         
         // This case is when fast and slow meet at head(head is the loop point), then iterate again until fast.next become head. and set fast.next to null.
         if(fast == head)
         {
            while(fast.next!=head)
            {
                fast = fast.next;
            }
            fast.next = null;
         }
            // Node fastNode = fast.next;
             fast.next = null;
        }
        
        
    }
}
