/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

*/

/*
Explanation: If first Copy Second Array Elements in First one from size m,

And then we just sort.

*/



class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       if(n>0){
            for(int i=0;i<n;i++){
                nums1[m]=nums2[i];
                m++;            
            }
                Arrays.sort(nums1);
        }
       
        
    }
}
