class Solution {
    public int reverse(int x) {
        int rem;
        int rev=0;
        int sign=1;
        if(x<0){
            sign=-1;
            x=x*-1;
        }
        while(x!=0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=(x-rem)/10;
        
            if(rev%10!=rem){
            return 0;
            }
        }
            return rev*sign;  
    }
}