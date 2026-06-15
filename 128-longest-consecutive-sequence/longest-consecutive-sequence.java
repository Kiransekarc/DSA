class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int maxlen = 0;

        for(int n: nums){
            s.add(n);
        }

        for(int n: s){
            if(s.contains(n-1)){
                continue;
            }

            int currlen = 0;
            while(s.contains(n)){
                currlen+=1;
                n+=1;
            }
            maxlen = Math.max(currlen, maxlen);
        }
        return maxlen;
    }
}