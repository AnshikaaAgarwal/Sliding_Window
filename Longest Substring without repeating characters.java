import java.util.*;
class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int n=s.length();
        int max=0;
        Map<Character,Integer> mp=new HashMap<>();
        while(j<n){
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);

            if(mp.size()==j-i+1){
                max=Math.max(max,j-i+1);
                j++;
            }
            else if(mp.size()<j-i+1){
                while(mp.size()<j-i+1){
                    mp.put(s.charAt(i), mp.get(s.charAt(i))-1);
                    if(mp.get(s.charAt(i))==0){
                        mp.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }

        }
      return max;  
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        int res=lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}