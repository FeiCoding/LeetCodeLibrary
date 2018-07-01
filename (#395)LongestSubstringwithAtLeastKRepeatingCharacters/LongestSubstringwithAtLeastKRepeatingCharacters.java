class Solution {
    public int longestSubstring(String s, int k) {
        char ch[] = s.toCharArray();
        return helper(ch, k, 0, ch.length);
    }
    
    private int helper(char[] ch, int k, int start, int end){
        if(end - start < k) return 0;
        int character[] = new int[26];
        for(int i = start; i < end; i++){
            character[ch[i] - 'a']++;
        }
        
        for(int j = 0; j < 26; j++){
            if(character[j] < k && character[j] > 0){//count[i]=0 => i+'a' does not exist in the string, skip it.
                for(int i = start; i < end; i++){
                    if(ch[i] == j + 'a'){
                        int left = helper(ch, k, start, i);
                        int right = helper(ch, k, i + 1, end);
                        return Math.max(left, right);
                    }
                }
            }
        }
        return end - start;
    }
}