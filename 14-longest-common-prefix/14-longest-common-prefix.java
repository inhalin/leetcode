class Solution {
    public String longestCommonPrefix(String[] strs) {
        String find = strs[0];
        int length = find.length();

        for (int i = 1; i < strs.length && 0 < length; i++) {
            int j = 0;
            while (j < length && j < strs[i].length() && find.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            length = j;
        }

        return find.substring(0, length);
    }
}