/** Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

**/

class Solution {
    public int insertionIndex(int[] nums, int target, boolean left){
        int start = 0;
        int end = nums.length;
        while(start < end){
            int mid = (start + end) /2 ;
            if(nums[mid] > target || (left && target == nums[mid])){
                end = mid;
            }else {
                start =  mid+1;
            }
        }
        return start;
        
}
    public int[] searchRange(int[] nums, int target) {
    int [] targetRange = {-1, -1};
        int leftIdx = insertionIndex(nums, target, true);
        if(leftIdx == nums.length || nums[leftIdx] != target){
            return targetRange;
        }
        targetRange[0] = leftIdx;
        targetRange[1] = insertionIndex(nums, target, false) -1;
        
        return targetRange;
    }
}
