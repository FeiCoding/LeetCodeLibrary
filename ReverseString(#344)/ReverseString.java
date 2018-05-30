class Solution {
    public String reverseString(String s) {
    	if(s.length() <= 1) return s;

    	int len = s.length();
    	String left = s.substring(0, len/2);
    	String right = s.substring(len/2, len);

    	return reverseString(right) + reverseString(left);
    }
}