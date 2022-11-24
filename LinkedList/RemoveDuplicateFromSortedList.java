/*

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
Input: head = [1,1,2,3,3]
Output: [1,2,3]

*/

/*

Explanation: 1). Two Pointer Approach
             Make two pointer as unique and check both pointing at head node.
             Let's Check data at check node and next to that node (i.e. check.next.data), 
             If both are not same -- make unique point to ith.next and move unique to its next's address and check to its next's address
             If both are same, just move check node to its next node.
             
             Do this until check reaches to last Node.
             Below is the code Reference
             
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */





class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode unique=head;
        ListNode check=head;
          
        if(head==null){
            return null;
        }
    
        while(check.next!=null){
             if(check.val!=check.next.val){
                unique.next=check.next;
                unique=unique.next;
                check=check.next;
            }
            
            else{
                check=check.next;   
                }
            
            }
        
             unique.next=null;
             return head;            
        }
    
}

