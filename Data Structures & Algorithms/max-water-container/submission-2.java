class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int n = heights.length;

        int l = 0;
        int r = n - 1;


        while (l < r){
            int h = Math.min(heights[l], heights[r]);
            int currMax = h * (r - l);
            max = Math.max(max, currMax);

            if (heights[l] < heights[r]) l ++;
            else  r--;
        }
        return max;
    }
}
