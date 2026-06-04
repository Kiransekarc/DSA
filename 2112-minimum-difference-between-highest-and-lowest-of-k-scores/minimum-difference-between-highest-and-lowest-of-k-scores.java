class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        if(k==1){
            return 0;
        }
        for(int i=0; i<=nums.length-k; i++){
            if(nums[i+k-1]-nums[i]<min){
                min = nums[i+k-1]-nums[i];
            }
        }
        return min;
    }
}