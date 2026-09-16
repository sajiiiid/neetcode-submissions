class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Create the canonical key (sorted version of word)
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);

            // 2. Insert into existing bucket or create a new one
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        // 3. Wrap all map values directly into the required List<List<String>>
        return new ArrayList<>(map.values());
    }
}