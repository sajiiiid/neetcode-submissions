class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charsS = new HashMap<>();
        Map<Character, Integer> charsT = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charsS.containsKey(c)) {
                charsS.put(c, charsS.get(c) + 1);
            }
            else
                charsS.put(c, 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = t.charAt(i);
            if (charsT.containsKey(c)) {
                charsT.put(c, charsT.get(c) + 1);
            }
            else
                charsT.put(c, 1);
        }

        if (charsS.equals(charsT))
            return true;
        return false;
    }
}
