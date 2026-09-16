class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] charCount = new int[26];
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
            }
            // 1. Create the canonical key
            String key = Arrays.toString(charCount);
            // 2. Insert into existing bucket or create a new one
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        // 3. Return values directly into the List<List<String>>
        return new ArrayList<>(map.values());
    }
}