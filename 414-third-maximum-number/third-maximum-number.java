class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                count++;
            }
        }

        if(count<2){
            return nums[nums.length-1];
        }

        int c = 0;
        int ans = 0;

        for(int i=nums.length-1; i>0; i--){
            if(nums[i]!=nums[i-1]){
                c++;
                if(c==2){
                    ans = nums[i-1];
                    break;
                }
            }
        }

        return ans;

    }
}