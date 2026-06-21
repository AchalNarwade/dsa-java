// https://leetcode.com/problems/maximum-ice-cream-bars/?envType=daily-question&envId=2026-06-21

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for(int cost : costs){
            if(coins>=cost){
                coins-=cost;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}