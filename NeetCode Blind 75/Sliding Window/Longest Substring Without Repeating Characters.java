import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set=new HashSet<>();
        int maxlength=0;
        int l=0;
        for(int r=0;r<s.length();r++){
           
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxlength=Math.max(maxlength,r-l+1);
                
            }
            else{
                while(s.charAt(l)!=s.charAt(r)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
                set.add(s.charAt(r));
            }
            
        }
        return maxlength;
    }
}
