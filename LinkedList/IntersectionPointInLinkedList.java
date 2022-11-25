/*

Very Important Problem

*/

/*

I have Solved the Problem Using Approach 1 (Approach 4 : Best Intuitive Algorithm)

# Approach 1: Time Complexity O(m+n) and space O(1) 

1). Lets Find Length of Linkedlist 1 and Length of LinkedList 2
    If Size of First Linkedlist is Greater then second Linkedlist

eg. size1=7;
    size2=5;
        
we move node pointing to head of first linkedlist by 2 i.e.(7-5)
        
eg2. size1=3;
     size2=5;
         
we move node pointing to head of second linkedlist by 2 i.e(5-3)
         
We do This so both,Pointer of both linkedlist are in Sync,
Now, we can just check, if there is any common address between,
    
If There is no, common Address, in the end we reach to null for both the list and return       null
    
2). Approach 2 : Time Complexity O(m) and Space Complexity O(m)

In this, we traverse in one Linkedlist and store it, in hashSet
Then, We go to other list and check,if we have any common address in hashSet
if found we return the common address i.e Intersection
If not found we return null

# Approach 3: O(m*n)
    
We keep the pointer at first Node and traverse the entire Second List to find common          intersection, Till we reach null of the first linkedList
    
------Best------ (Asked in Interview)

4). Approach 4: Crazy Approach (I was not able to think about this, I found this approach from youtube : You can Check Fraz youtube channel for this approach)

x is the common length in Both LinkedList From where Intersection starts till the end

L1=(m+x) then (n+x)
L2=(n+x) then (m+x)

--- To make them in Synch

Node1 is pointing to head of first LinkedList


Travel Node1 by (m+x) as, soon as Node1 reaches null for the first time,
Point it to head of LinkedList 2  and travel one by one 

Simultaneously Travel Node2 by (n+x) as, soon as Node2 reaches null for the first time,
Point it to head of LinkedList 1 and Travel one by one

There will be a point where both are in Sync



*/

// Approach 4:

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    ListNode check1=headA;
    ListNode check2=headB;
    
    while(check1!=check2){
        
        if(check1==null){
            check1=headB;
        }
        else{
            check1=check1.next;
        }
        
        if(check2==null){
            check2=headA;
        }
        else{
            check2=check2.next;
        }
        
    }
        return check1;
        
    
    }
}


//Approach 1:
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     
     int size1=0;
     int size2=0;
        
     ListNode check1=headA;
     ListNode check2=headB;
        
    while(check1!=null){
        check1=check1.next;
        size1++;
    }
    
    while(check2!=null){
        check2=check2.next;
        size2++;
    }
        
    check1=headA;
    check2=headB;
    if(size1>size2){
        while(size1!=size2){
        check1=check1.next;
            size1--;
        }
    }
    
 
    else if(size2>size1){
        while(size2!=size1){
        check2=check2.next;
            size2--;
        }
    }
    
    while(check1!=null && check2!=null){
        if(check1==check2){
            return check1;
        }
        else{
            check1=check1.next;
            check2=check2.next;
        }
    }
        
    return check1;

    }
}
