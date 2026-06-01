class Solution {
    public int[] buildArray(int[] nums) {
        int k=0;
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[k] = nums[nums[i]];
            k++;
        }
        return res;
    }

}