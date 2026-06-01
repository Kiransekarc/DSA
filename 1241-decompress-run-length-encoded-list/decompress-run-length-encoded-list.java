class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int l=0; l<nums.length; l+=2){
            size+=nums[l];
        }
        int[] arr = new int[size];
        int k=0;
        for(int i=0; i<nums.length; i+=2){
            int freq = nums[i];
            for(int j=0; j<freq; j++){
                arr[k] = nums[i+1];
                k++;
            }
        }
        return arr;
    }
}