/* Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
*/

class Solution {
    public int maxArea(int[] height) {
        
        // int maxArea = 0;
        // for(int i =0; i < height.length; i++){
        //     for(int j = i+1; i<height.length; j++){
        //         maxArea = Math.max(maxArea, Math.min(height[i], height[j]*(j-1)));
        //     }
        // }
        // return maxArea;
        
        // maintain a variable maxArea to store the maximum area obtained 
        // at every step we find out the area formed between them , update the area and move the area pointing towards the other end by one step. 
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
 



