class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int curIndex = 0;
        while(index < chars.length){
            int count = 0;
            char c = chars[index];
            while(index < chars.length && c == chars[index]){
                index ++;
                count ++;
            }
            chars[curIndex++] = c;
            if(count != 1)
                for(char num : Integer.toString(count).toCharArray())
                    chars[curIndex++] = num;
        }
        return curIndex;
        
    }
}