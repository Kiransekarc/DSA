class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;

    for(int i=0; i<nums.length; i++){
        cur_sum+=nums[i];
        if(cur_sum>max_sum){
            max_sum = cur_sum;
        }
        if(cur_sum<0){
            cur_sum = 0;
        }
       // max_sum = Math.max(cur_sum, max_sum);

    }
    return max_sum;
    }
}