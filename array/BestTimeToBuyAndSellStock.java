// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=problem-list-v2&envId=array

class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxProfit = 0;
        for(int price : prices){
            min_price = Math.min(min_price,price);
            int profit = price - min_price;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}