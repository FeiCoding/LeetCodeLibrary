class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail){
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if(!Character.isLetterOrDigit(cHead))
                head ++;
            else if(!Character.isLetterOrDigit(cTail))
                tail--;
            else if(Character.toLowerCase(cHead) != Character.toLowerCase(cTail))
                return false;
            else{
                head++;
                tail--;
            }
        }
        return true;
    }
}

