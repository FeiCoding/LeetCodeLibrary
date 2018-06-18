class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> allList = new ArrayList<List<String>>();
        List<String> list = new ArrayList<String>();
        backtrack(s, allList, list, 0);
        return allList;
    }
    
    private void backtrack(String s, List<List<String>> allList, List<String> tempList, int start){
        if(start == s.length()){
            allList.add(new ArrayList<>(tempList));
        }else{
            for(int i = start; i < s.length(); i++){
                if(isPalindrome(s, start, i)){
                    tempList.add(s.substring(start, i + 1));
                    backtrack(s, allList, tempList, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }

        }
    }
    
    public boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}