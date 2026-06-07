class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        for(int i=0; i<fruits.length; i++){
            int j=0;
            
            int num = fruits[i];
            while(j<baskets.length){
                if(num<=baskets[j]){
                    baskets[j] = 0;
                    break;
                }
                j++;
            }
            if(j==baskets.length){
                count+=1;
            }
        }
        return count;
    }
}