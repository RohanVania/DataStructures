/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

Input: head = [3,2,0,-4], pos = 1
Output: true

Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

*/

/*
Approach 1: You can stores address of each node and hashset and check if the same address is present in hashset or not; If it comes true return true

Approach 2: Use Floyd's Cycle Algorithm

Two pointer concept:

let's say 2 people are running in a circular track, one person is running slowly and another person is running faster(2 times the speed of first person)

After a certain period of time person 2 again meet or overtake person 1,

In that case we can conclude that the track is circular ( replace running track with our Linked list)

*/



public class Solution {
    
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
