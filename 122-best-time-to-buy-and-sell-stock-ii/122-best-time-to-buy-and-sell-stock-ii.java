class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;

        int sum = 0;
        boolean bought = false;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1] && !bought) {
                sum -= prices[i];
                bought = true;
            } else if (prices[i] > prices[i + 1] && bought) {
                sum += prices[i];
                bought = false;
            }
        }

        if (bought) {
            sum += prices[prices.length - 1];
        }

        return sum;
    }
}