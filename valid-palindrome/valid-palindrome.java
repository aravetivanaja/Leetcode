class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim().toLowerCase();
        if(s.length()==0)
        {
            return true;
        }   
            int f=0;
            int l=s.length()-1;
                while(f<=l)
                {
                    if(!Character.isLetterOrDigit(s.charAt(f))==true)
                    {
                        f++;
                    }
                     else if(!Character.isLetterOrDigit(s.charAt(l))==true)
                        {
                            l--;
                        }
                    else
                    {
                        if(s.charAt(f)!=s.charAt(l))
                    {
                        return false;
                    }
                    f++;
                    l--;
                    }
                }
            
        
        return true;
        
    }
}
