class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.length() == 0) return ans;
        ans.add("");
        String mapping[] = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i = 0; i < digits.length(); ++i){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i){
                char info[] = mapping[x].toCharArray();
                String s = ans.remove();
                for(char ch : info)
                    ans.add(s + ch);
            }
        }
        return ans;
    }
}