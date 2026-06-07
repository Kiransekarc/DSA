class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //2 Pointer approach

        int left = 0;
        int right = numbers.length-1;
        int[] arr = new int[2];
        int k =0;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                arr[k] = left+1;
                k++;
                arr[k] = right+1;
                
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return arr;
    }
}