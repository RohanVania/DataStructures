
/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

*/

/*
        Naive Approach : Find Size and find the middle number and run loop and Node that much times, you will get the Middle Node
        
        Two Pointer Approach: Fast moves by 2 and slow by 1 
        so, when fast reaches end slow will be at middle
        
*/

class Solution {
    public ListNode middleNode(ListNode head) {
        
        // Naive Method
        
        /*
        ListNode current=head;
        int size=1;
        while(current.next!=null){
            current=current.next;
            size++;
        }
        
        size=size/2;
        ListNode slow=head;
        for(int i=0;i<size;i++){
            slow=slow.next;
        }
        return slow;
        */
        
        // Two Pointer Approach
        
   
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null  &&  fast.next!=null)
        {
            
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
        

        
    }
}
