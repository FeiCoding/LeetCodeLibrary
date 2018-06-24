class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String keyValue = String.valueOf(ch);
            if(!map.containsKey(keyValue)) map.put(keyValue, new ArrayList<String>());
            map.get(keyValue).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}