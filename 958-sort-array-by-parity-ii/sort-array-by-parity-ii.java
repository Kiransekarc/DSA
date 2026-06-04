class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int res[] = new int[nums.length];
        int k=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                res[k] = nums[i];
                k+=2;
            }
        }

        k=1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                res[k] = nums[i];
                k+=2;
            }
        }
        return res;
    }
}