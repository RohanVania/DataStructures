
/*

Problem : Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Explanation : 1). We can Create New Empty Array and store unique elements one by one, by iterating over the given Array : O(n) Extra Space
              2). Two Pointer Approach O(1) Extra Space
              
              Create two pointer i and j at zero-th index, and SINCE Array is Sorted
              We check element at i and element next to it i.e array[i+1], If Elements at i and i+1 are not same we,
              replace element at j by element at ith position and move j by 1
              We do this till i reaches at Array length(n-2)
          
              Below is the code for your Reference.

*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        // J is placed at zero index.
        int j=0;
        int i;
        
        /*
        Since, Array is Sorted, 
        We check for i and next element of i until we find unique and then replace the jth             position element
        */
        
        for(i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j]=nums[i];
                j++;
            }
        }
        nums[j]=nums[i];
        j++;
        return j;
        
        
    }
}
