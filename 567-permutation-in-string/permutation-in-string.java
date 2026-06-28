class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(!need.containsKey(c)) need.put(c,0);
            need.put(c, need.get(c)+1);
        }

        int start = 0;
        int end = 0;
        while(end<s2.length()){
            char c = s2.charAt(end);
            if(!need.containsKey(c)){
                end+=1;
                start = end;
                have.clear();
                continue;
            }

            if(!have.containsKey(c)) have.put(c, 0);
            have.put(c, have.get(c)+1);

            while(have.get(c)>need.get(c)){
                char s = s2.charAt(start);
                have.put(s, have.get(s)-1);
                start+=1;
            }

            int window_size = end-start+1;
            if(window_size == s1.length()) return true;

            end++;
        }
        return false;
    }
}