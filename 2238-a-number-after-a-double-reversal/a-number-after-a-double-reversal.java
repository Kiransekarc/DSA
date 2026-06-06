class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int rev1 = 0;

        while(temp!=0){
            int n = temp%10;
            rev1 = n+(rev1*10);
            temp/=10;

        }
        
        int ans1 = rev1;

        int ans2=0;

        while(rev1!=0){
            int n = rev1%10;
            ans2 = n+(ans2*10);
            rev1/=10;
        }

        if(num==ans2){
            return true;
        }
        return false;
    }
}