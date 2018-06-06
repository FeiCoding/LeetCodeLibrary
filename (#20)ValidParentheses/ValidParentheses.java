class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        char ch[] = s.toCharArray();
        for(char c : ch){
            if(c == '(') st.push(')');
            else if(c == '[') st.push(']');
            else if(c == '{') st.push('}');
            
            else if(st.isEmpty() || st.pop() != c)
                return false;
        }
        
        return st.isEmpty();
    }
}