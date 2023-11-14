class Solution {
    public boolean isAnagram(String s, String t) {
        int []c1=countFrequency(s);
        int[] c2=countFrequency(t);
        for(int i=0;i<26;i++)
        {
            if(c1[i]!=c2[i])
            {
                return false;
            }
        }
        return true;
        
    }
    static int[] countFrequency(String st)
    {
        int[] count=new int[26];
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                count[ch-65]++;
            }
            else if(ch>='a' && ch<='z')
            {
                count[ch-97]++;
            }
        }
        return count;
    }
}