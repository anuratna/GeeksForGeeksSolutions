class Solution{
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        
        Node f = Reverse(first);
        Node s = Reverse(second);
        int sum = 0;
        int carry = 0;
        Node result = null;
        Node NewList = null;
        Node prev = null;
        while(f!=null || s!=null)
        {
            sum = carry + (f!=null ? f.data:0)+ (s!=null ? s.data :0);
            carry = (sum>=10 ? 1:0);
            sum = sum % 10;
            result = new Node(sum);
            if(NewList == null)
            {
                NewList = result;
            }
            else{
                 prev.next = result;
            }
            prev = result;
            
            sum = 0;
            
            if(f!=null){f = f.next;}
            if(s!=null){s = s.next;}
        }
          if(carry!=0)
          {
              prev.next = new Node(carry);
          }
          
          Node newList = Reverse(NewList);
        return newList;    
        
    }
    //Reverse Function
    static Node Reverse(Node head){
        
        Node previous = null;
        Node current = head;
        Node next = current.next;
        
        if(head==null)
        {
            return null;
        }
       while(current != null)
        {
            
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }          
         return previous;   
        }
}
