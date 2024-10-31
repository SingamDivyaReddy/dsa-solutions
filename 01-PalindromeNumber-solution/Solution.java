class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rem,sum=0;
        while(x>0){
            rem=x%10;
            sum=(sum*10)+rem;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        else
        return false;
    }
}