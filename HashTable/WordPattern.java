// https://leetcode.com/problems/word-pattern/submissions/2025577220/?envType=problem-list-v2&envId=hash-table

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            String str = arr[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(str)){
                    return false;
                }
            }else{
                if(set.contains(str)){
                    return false;
                }
            }
            map.put(ch,str);
            set.add(str);
        }
        return true;
    }
}