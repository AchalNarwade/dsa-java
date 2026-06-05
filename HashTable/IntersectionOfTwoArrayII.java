// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/?envType=problem-list-v2&envId=hash-table

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums2){
            if(map.getOrDefault(i,0)>0){ //check for the intersection
                list.add(i);
                map.put(i,map.get(i)-1); //reduce the frequency as we add the copy in the list
            }
        }
       int result[] = new int[list.size()];
       for(int i=0;i<list.size();i++){
        result[i] = list.get(i);
       }
       return result;
    }
}