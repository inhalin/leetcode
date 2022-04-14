class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        int len = (int) Math.log10(x) + 1;
        if (x < 0) len++;
        int[] nums = new int[len];
        int i = 0;
        while (len > 0) {
            nums[i++] = x % 10;
            x = x / 10;
            len--;
        }
        
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == nums[right]) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}