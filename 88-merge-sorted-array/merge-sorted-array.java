class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int res[] = new int[m+n];
        int k=0;

        for(int i=0; i<m; i++){
            res[k] = nums1[i];
            k++;
        }

        for(int i=0; i<n; i++){
            res[k] = nums2[i];
            k++;
        }

        Arrays.sort(res);

        for(int i=0; i<res.length; i++){
            nums1[i] = res[i];
        }

    }
}