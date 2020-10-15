class Solution
{
    int getMiddle(Node head)
    {
         //Node[] n = new Node[100];
         ArrayList<Node> ls = new ArrayList<Node>();
         int temp = 0;
         
         while(head!= null)
         {
             ls.add(temp,head);
             head = head.next;
             temp++;
         }
         Node num = ls.get(temp/2);
         return num.data;
         
    }
}
