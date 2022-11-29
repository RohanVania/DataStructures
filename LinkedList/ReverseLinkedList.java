/*
   Given the head of a singly linked list, reverse the list, and return the reversed list.
   
   Input: head = [1,2,3,4,5]
   Output: [5,4,3,2,1]
   

*/

/*
   
  Explanation: 1->2->3->4->5
              head 
              
  lets have Three Pointer Previous Pointing to Null and Current to head;
  
  Untill (current!=null)
   We store current next as temp;
   then, we point current to previous eg  Null<-1
   and Previous as Current
   and current as Temp
  
  eg                         Null<-1         2->        3->4->5
                                previous   current
                                
           When the while loop runs second time it will be
           
                            Null <- 1   <-2          3        ->4->5 
                                        previous    current
                                        
   So on, till
   
   Null <-1 <-2 <-3 <-4 <-5          null 
                       previous    current
                       
                       
 */                      


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous=null;
        ListNode current=head;
        
        while(current!=null){
            ListNode temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
            
        }
        
        return previous;
        
    }
}
