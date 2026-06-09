class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int[] res = new int[2];
        int k=0;
        
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                res[k] = l+1;
                k++;
                res[k] = r+1;
                break;
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}