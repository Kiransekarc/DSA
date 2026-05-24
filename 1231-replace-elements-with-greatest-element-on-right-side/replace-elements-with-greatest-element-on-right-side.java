class Solution {
    public int[] replaceElements(int[] arr) {

        for(int i=0; i<arr.length; i++){
            int max = -1;
            for(int j=i+1; j<arr.length; j++){
                int curr = arr[j];
                max = Math.max(curr, max);
            }
            arr[i]=max;
        }
        return arr;
    }
}