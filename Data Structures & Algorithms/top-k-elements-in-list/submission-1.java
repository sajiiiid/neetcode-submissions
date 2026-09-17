class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int[] max = new int[k];

        // 1. Count frequencies
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        
        // 2. Extract unique keys
        List<Integer> uniqueNums = new ArrayList<>(count.keySet());
        
        // 3. Sort unique numbers descending by their frequency in the map
        uniqueNums.sort((a, b) -> Integer.compare(count.get(b), count.get(a)));
        
        // 4. Collect top k elements
        for (int i = 0; i < k; i++) {
            max[i] = uniqueNums.get(i);
        }
        
        return max;
    }
}
