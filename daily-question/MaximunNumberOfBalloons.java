// https://leetcode.com/problems/maximum-number-of-balloons/submissions/2042459350/?envType=daily-question&envId=2026-06-22

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int b = map.getOrDefault('b',0);
        int a = map.getOrDefault('a',0);
        int l = map.getOrDefault('l',0)/2;
        int o = map.getOrDefault('o',0)/2;
        int n = map.getOrDefault('n',0);

        int ans  = Math.min(Math.min(Math.min(b,a),Math.min(l,o)),n);
        return ans;
    }
}