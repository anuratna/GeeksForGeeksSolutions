lass Solution
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        int count = 0;
        Node prev = null;
        Node next = null;
        Node current = node;
        
        while(count<k && current!=null)
        {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
          count++;
        }
        if(current!=null)
        {
            node.next = reverse(current,k);
        }
        return prev;
    }
}
