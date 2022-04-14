class Solution {
    public boolean isPalindrome(int x) {
        int reversed = 0;
        int cloned = x;
        
        while (cloned > 0) {
            reversed = reversed * 10 + cloned % 10;
            cloned /= 10;
        }
        
        return x == reversed;
    }
}