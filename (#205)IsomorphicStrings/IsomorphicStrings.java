class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char sc[] = s.toCharArray();
        char tc[] = t.toCharArray();
        Map<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0; i < sc.length; i++){
            if(map.containsKey(sc[i])){
                if(map.get(sc[i]) != tc[i])
                    return false;
                else continue;
            }
            else{
                if(map.containsValue(tc[i]))
                    return false;
                else map.put(sc[i], tc[i]);
            }
        }
        return true;
    }
}