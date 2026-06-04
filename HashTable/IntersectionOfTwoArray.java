// https://leetcode.com/problems/intersection-of-two-arrays/submissions/2022549254/?envType=problem-list-v2&envId=hash-table

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resultset = new HashSet<>();
        for(int i: nums1){
            set.add(i);
        }
        for(int i:nums2){
           if(set.contains(i)){
           resultset.add(i);
            }
        }
        int result[] = new int[resultset.size()];
        int index = 0;
        for(int i : resultset){
            result[index] = i;
            index++;
        }
        return result;
    }
}