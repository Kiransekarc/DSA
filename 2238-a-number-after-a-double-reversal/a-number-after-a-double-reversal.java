class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1 = num;
        int rev1 = 0;
        while(temp1!=0){
            int digit = temp1%10;
            rev1 = rev1*10+digit;
            temp1/=10; 
        }

        int temp2 = rev1;
        int rev2 = 0;
        while(temp2!=0){
            int digit = temp2%10;
            rev2 = rev2*10+digit;
            temp2/=10; 
        }

        if(num==rev2) return true;
        return false;
    }
}