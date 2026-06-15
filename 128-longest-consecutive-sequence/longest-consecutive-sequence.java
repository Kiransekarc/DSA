class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> s = new HashSet<>();

        for(int n : nums){
            s.add(n);
        }

        int maxlen = 0;

        for(int n : s){

            if(s.contains(n - 1))
                continue;

            int currlen = 1;
            int curr = n;

            while(s.contains(curr + 1)){
                curr++;
                currlen++;
            }

            maxlen = Math.max(maxlen, currlen);
        }

        return maxlen;
    }
}