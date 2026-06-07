class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int maxcount = 0;
        int zeroes = 0;
        for(int r=0; r<nums.length; r++){
            if(nums[r]==0){
                zeroes+=1;
            }
            while(zeroes>k){
                if(nums[l]==0){
                    zeroes-=1;
                }
                l++;
            }
            maxcount = Math.max(maxcount, r-l+1);
        }
        
        return maxcount;
    }
}