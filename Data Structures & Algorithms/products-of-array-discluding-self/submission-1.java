class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;

        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++){
            left[i] = left[i -1] * nums[i - 1];

        }

        int[] right = new int[n];
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++){
            res[i] = left[i] * right[i];
        }

        return res;
    }
}
