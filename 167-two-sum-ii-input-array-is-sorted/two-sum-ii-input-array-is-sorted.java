class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int cursum = 0;
        int[] res = new int[2];
        int k=0;

        while(left<right){
            cursum = numbers[left]+numbers[right];
            if(cursum==target){
                res[k] = left+1;
                k++;
                res[k] = right+1;
                break;
                
            }
            else if(cursum>target){
                right--;
            }
            else if(cursum<target){
                left++;
            }
        }
        return res;
    }
}