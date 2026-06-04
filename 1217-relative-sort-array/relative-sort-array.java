class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int k=0;
        int count1 = 0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr1[j]==arr2[i]){
                    res[k] = arr1[j];
                    k++;
                    count1++;
                }
            }
        }
        
        int m = arr1.length-count1;
        int[] res2 = new int[m];
        int l = 0;
        for(int i=0; i<arr1.length; i++){
            int count=0;
            
            for(int j=0; j<res.length; j++){
                if(arr1[i]==res[j]){
                    count++;
                }
            }
            if(count>=1){

            }
            else{
                res2[l] = arr1[i];
                l++;
            }
        }
        Arrays.sort(res2);
        int o = 0;
        for(int i=res.length-m; i<res.length; i++){
            res[i] = res2[o];
            o++;
        }
        return res;

    }
}