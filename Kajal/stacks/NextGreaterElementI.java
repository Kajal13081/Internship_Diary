//  Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/

// Example 1:

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
  
// // Example 2:

// Input: nums1 = [2,4], nums2 = [1,2,3,4]
// Output: [3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
// - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
  
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = -1;  // to store -1 phle se hi in that index ki if inner loop ends and we didnt get answer toh vo -1 ho na ki by default wala 0
            for(int j=nums2.length-1;nums1[i]!=nums2[j];j--){
                if(nums2[j]>nums1[i]){
                    result[i] = nums2[j];
                }
                // else{  // fails for testcase [1,3,5,2,4]
                                                // [6,5,4,3,2,1,7]
                //     result[i] = -1;
                // }
            }
        }
        return result;
    }
}
     
