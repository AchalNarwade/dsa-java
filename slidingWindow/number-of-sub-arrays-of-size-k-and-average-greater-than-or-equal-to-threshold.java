// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/2045734032/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int subarray = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        if((windowSum/k)>=threshold){
            subarray++;
        }
        for(int right = k;right<arr.length;right++){
            windowSum += arr[right];
            windowSum -= arr[right-k];

            if((windowSum/k)>=threshold){
                subarray++;
            }
        }
        return subarray;
    }
}