public class Solution {
    public String reverseWords(String s) {
        char ch[] = s.toCharArray();
        int l = ch.length;
        reverse(ch, 0, l - 1);
        reverseWord(ch, l);
        return clearSpace(ch, l);
    }
    private void reverseWord(char []ch, int l){
        int i = 0;
        int j = 0;
        while(i < l){
            while(j < i || j < l && ch[j] != ' ') j++;            
            reverse(ch, i, j - 1);
            while(i < j || i < l && ch[i] == ' ') i++;
        }
    }
    private String clearSpace(char ch[], int l){
        int i = 0;
        int j = 0;
        while(j < l){
            while(j < l && ch[j] == ' ') j++;
            while(j < l && ch[j] != ' ')ch[i++] = ch[j++];
            while(j < l && ch[j] == ' ') j++;
            if(j < l) ch[i++] = ' ';
        }
        return new String(ch).substring(0, i);
    }
    
    private void reverse(char []ch, int i, int j){
        while(i < j){
            char temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }    
    }
}