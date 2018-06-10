class Solution {
    public int firstUniqChar(String s) {
        char []c = s.toCharArray();
        int chara[] = new int[26];
        for(char ch : c)
            chara[ch - 'a']++;
        for(int i = 0; i < c.length; i++)
            if(chara[c[i] - 'a'] == 1)
                return i;
        return -1;
    }
}