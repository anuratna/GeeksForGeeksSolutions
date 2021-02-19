class ReverseLL
{
    // This function should reverse linked list and return
    // head of the modified linked list.
    Node reverseList(Node head)
    {
        
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
