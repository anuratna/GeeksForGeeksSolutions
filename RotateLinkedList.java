
class Rotate{
    // This function should rotate list counter-
    // clockwise by k and return head node
    
    public Node rotate(Node head, int k) {
        
        //Going till k =4 with a counter.
        //Setting k.next = null;(curr.next = null)
        //setting k+1 = head; (head = curr.next);
        //Setting last element.next to head (n.next = head)
        
        
        int count = 1;
        Node curr = head;
        while(count<k && curr!=null)
        {
            curr = curr.next;
            count++;
        }
        
        Node n = curr;
        while(n.next!=null)
        {
            n = n.next;
        }
        n.next = head;
        head = curr.next;
        curr.next = null;
        return head; 
    }
 
}
