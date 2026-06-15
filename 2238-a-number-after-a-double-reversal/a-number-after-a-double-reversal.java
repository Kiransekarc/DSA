class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp1 = num;
        int rev1 = 0;
        int rev2 = 0;
        while(temp1!=0){
            int n = temp1%10;
            rev1 = (rev1*10)+n;
            temp1/=10;
        }

        int temp2 = rev1;
        while(temp2!=0){
            int n = temp2%10;
            rev2 = (rev2*10)+n;
            temp2/=10;
        }

        if(num==rev2){
            return true;
        }
        return false;
    }
}