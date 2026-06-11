// https://leetcode.com/problems/happy-number/submissions/2030058964/?envType=problem-list-v2&envId=hash-table

class Solution {
    public boolean isHappy(int n) {
        HashSet set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);

            int sum = 0;

            //for calculating squares
            while(n>0){
                int digit = n%10;
                sum += digit * digit;
                n/=10;
            }
            n= sum;
        }
        return true;
    }
}