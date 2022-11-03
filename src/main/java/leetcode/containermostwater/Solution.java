package leetcode.containermostwater;

/**
 * 11. Container With Most Water <a href="https://leetcode.com/problems/container-with-most-water/"/>
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length -1;

        int maxTemp = 0;
        while(left<right){

            int maxHeight = height[left] < height[right] ?  height[left] : height[right];
            int width = right-left;

            int area = width*maxHeight;

            maxTemp = area>maxTemp ? area : maxTemp;

            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }

        return maxTemp;
    }
}