class Solution
{
    int getMiddle(Node head)
    {
        Node p1 = head;
        Node p2 =head;
        if(head !=null){
        while( p1.next !=null && p1.next.next != null)
        {
            p2 = p2.next;
            p1=p1.next.next;
        }
        
    }
     if(p1.next !=null)
    {
        return p2.next.data;
    }else{
        return p2.data;
    }
        
    }
}
