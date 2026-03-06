class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int orgNum = x;
        int revNum=0;
        int r=0;
        while(x>0){
            int num=x%10;
            revNum=revNum*10+num;
            x/=10;
        }
        if(revNum==orgNum){
            return true;
        }
        else{
            return false;
        }
    }
}