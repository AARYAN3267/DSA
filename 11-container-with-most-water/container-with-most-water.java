class Solution {
    public int maxArea(int[] height) {
              int i=0, j=height.length-1, maxArea=0, area,h;
        while(i<j){
            h=Math.min(height[i],height[j]);
            area=h*(j-i);
            maxArea=(area>maxArea)?area:maxArea;

            while(i<j && height[i]<=h) i++;
            while(i<j && height[j]<=h) j--;
            
        }
        return maxArea;
    }
}