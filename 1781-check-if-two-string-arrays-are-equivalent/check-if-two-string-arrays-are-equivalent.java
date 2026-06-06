class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for(int i=0; i<word1.length; i++){
            String w = word1[i];
            for(int j=0; j<word1[i].length(); j++){
                str1 += w.charAt(j);
            }  
        }

        for(int i=0; i<word2.length; i++){
            String w = word2[i];
            for(int j=0; j<word2[i].length(); j++){
                str2 += w.charAt(j);
            }  
        }
    boolean var = false;
        if(str1.length()!=str2.length()){
            return false;
        }

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)==str2.charAt(i)){
                var = true;
            }
            else{
                return false;
            }
        }
        return var;

    }
}