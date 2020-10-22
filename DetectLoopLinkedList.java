class Solution {
    public static boolean detectLoop(Node head){
        Node lowNode = head; Node highNode = head;
        boolean flag = false;
        //Floyde's Algorithm of loop detection.
        while(highNode != null&&highNode.next!=null)
        {
            lowNode = lowNode.next;
            highNode = highNode.next.next;
            if(highNode==lowNode)
            {
                return true;
            }
        }
         return false;
    }
}
