class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (!seen.containsKey(y)) {
                seen.put(nums[i], i);
            }
            else {
                return new int[] { seen.get(y), i };
            }
        }
        return indices;
    }
}