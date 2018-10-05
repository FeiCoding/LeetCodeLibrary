class Solution {
    public String reverseWords(String s) {
        String strs[] = s.split(" ");
        List<String> res = new ArrayList<String>();
        for(String str : strs) res.add(new StringBuffer(str).reverse().toString());
        StringBuilder sb = new StringBuilder();
        for(String str : res) sb.append(str).append(" ");
        return sb.toString().trim();
    }
}