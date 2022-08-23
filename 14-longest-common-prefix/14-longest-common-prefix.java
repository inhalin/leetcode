class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs[0].length();
        
        for (int i = 1; i < strs.length; i++) {
            length = Math.min(strs[i].length(), length);
            
            for (int j = 0; j < length; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    length = j;
                    break;
                }
            }
        }
        
        return strs[0].substring(0, length);
    }
}