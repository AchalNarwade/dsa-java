// https://leetcode.com/problems/majority-element/?envType=problem-list-v2&envId=hash-table

class Solution {
    public int majorityElement(int[] nums) {
        int count = (int)(Math.floor(nums.length/2));
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>count){
                return key;
            }
        }
        return -1;
    }
}