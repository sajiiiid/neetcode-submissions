public class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for (String s : strs) {
            str.append(s.length()).append('#').append(s);
        }

        return str.toString();
    }

    public List<String> decode(String encoded) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < encoded.length()) {
            int j = i;
            while (encoded.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(encoded.substring(i, j));

            int start = j + 1;
            int end = start + length;

            res.add(encoded.substring(start, end));

            i = end;
        }

        return res;
    }
}