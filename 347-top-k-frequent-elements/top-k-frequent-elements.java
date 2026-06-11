class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countmap = new HashMap<>();
        for(int num: nums){
            countmap.put(num, countmap.getOrDefault(num, 0)+1);
        }

        Map<Integer, List<Integer>> reversecountmap = new HashMap<>();

        for(int num: countmap.keySet()){
            int count = countmap.get(num);

            if(!reversecountmap.containsKey(count)){
                reversecountmap.put(count, new ArrayList<>());
            }
            reversecountmap.get(count).add(num);
        }

        int[] res = new int[k];
        int index = 0;

        for(int possiblecount = nums.length; possiblecount>=1; possiblecount--){
            if(reversecountmap.containsKey(possiblecount)){
                for(int num: reversecountmap.get(possiblecount))
                {
                    if(index<k){
                        res[index] = num;
                        index++;
                    }
                    else{
                        break;
                    }
                }
            }
            if(index>=k){
                break;
            }
        }
        return  res;
    }
}