class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currOnes = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                currOnes+=1;
            }
            if(nums[i]!=1){
                max = Math.max(currOnes, max);
                currOnes = 0;
            }
        }
        max = Math.max(currOnes, max);
        return max;
    }
}