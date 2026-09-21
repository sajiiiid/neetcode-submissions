class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }

        int maxStreak = 0;

        for (int num : seen) {
            // Step 1: Only start counting if 'num' is the beginning of a sequence
            if (!seen.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Step 2: Expand the streak forward
                while (seen.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Step 3: Record the maximum streak seen so far
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }

        return maxStreak;
    }
}