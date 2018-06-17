class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> strs = new ArrayList<String>();
        backtrack(strs, "", 0, 0, n);
        return strs;
    }
    
    public void backtrack(List<String> strs, String str, int open, int close, int max){
        if(str.length() == max * 2){
            strs.add(str);
            return;
        }
        if(open < max) backtrack(strs, str + "(", open + 1, close, max);
        if(close < open) backtrack(strs, str + ")", open, close + 1, max);
    }
}