public class Solution {
    public bool IsPalindrome(int x) {
        
        int rev=0,temp=x;
        while(x>0)
        {
            int d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        return(rev==temp);
    }
}