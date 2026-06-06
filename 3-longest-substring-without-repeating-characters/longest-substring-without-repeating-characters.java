class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_len = Math.min(s.length(),1);

        Set<Character> seen = new HashSet<>();
    while(end<s.length()){
        
        char ch = s.charAt(end);
        while(seen.contains(ch)){
            seen.remove(s.charAt(start));
            start+=1;
        }
        seen.add(s.charAt(end));
        int window_sum = end-start+1;
        max_len = Math.max(window_sum, max_len);
        end+=1;

    }
    return max_len;
    }
}