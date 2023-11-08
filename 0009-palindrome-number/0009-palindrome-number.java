class Solution {
    public boolean isPalindrome(int x) {

       int temp=x;
       String s="";
       s=s+x;
       char ch[]=s.toCharArray();
       int f=0;
       int l=ch.length-1;
       while(f<l)
       {
           if(ch[f]!=ch[l])
           {
               return false;
           }
           f++;
           l--;
       }
       return true;
    }      
    
}