class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i<bulbs.size(); i++){
            int count = 0;
            for(int j=0; j<bulbs.size(); j++){
                if(bulbs.get(i)==bulbs.get(j)){
                    count++;
                }
            }
            if(count%2!=0){
                res.add(bulbs.get(i));
            }
        }
        
        HashSet<Integer> set = new HashSet<>(res);
        res = new ArrayList(set);
        Collections.sort(res);
        return res;
    }
}