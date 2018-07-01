class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        boolean f[] = new boolean[s.length() + 1];//substring is left open and right close
        f[0] = true;
        for(int i = 1; i <= s.length(); i ++){
            for(int j = 0; j < i; j ++){
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;//substring is left open and right close
                    break;
                }
            }
        }
        
        return f[s.length()];
    }
}