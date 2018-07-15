class Solution {
    int start = 0, max = 0;
    
    public String longestPalindrome(String s) {
        if(s.length() < 2)
            return s;
        for(int i = 0; i < s.length(); i ++){
            findP(s, i, i);
            findP(s, i, i + 1);
        }
        return s.substring(start, start + max);
    }
    
    private void findP(String s, int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        if(max < j - i - 1){
            start = i + 1;
            max = j - i - 1;
        }
    }
}