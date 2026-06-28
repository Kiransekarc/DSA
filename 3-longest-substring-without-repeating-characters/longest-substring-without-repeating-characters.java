class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_len = Math.min(1, s.length());

        Set<Character> seen = new HashSet<>();
        while(end<s.length()){
            while(seen.contains(s.charAt(end))){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(s.charAt(end));
            int window_size = end-start+1;
            max_len = Math.max(max_len, window_size);
            end+=1;
        }
        return max_len;
    }
}