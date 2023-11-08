class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char pch=st.pop();
                if(ch=='}' && pch!='{')
                {
                    return false;
                }
                else if(ch==']' && pch!='[')
                {
                    return false;
                }
                else if(ch==')' && pch!='(')
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
}