class Solution {
    public String alienOrder(String[] words) {
        
        HashMap<Character, Set<Character>> map = new HashMap<>();
        HashMap<Character, Integer> degree = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
        if(words.length == 0 || words == null) return "";
        
        for(String word : words){
            for(char ch : word.toCharArray()){
                degree.put(ch, 0);
            }
        }
        
        for(int i = 0; i < words.length - 1; i++){
            char cur[] = words[i].toCharArray();
            char next[] = words[i + 1].toCharArray();
            int length = Math.min(cur.length, next.length);
            for(int j = 0; j < length; j++){
                if(cur[j] != next[j]){
                    Set<Character> set = new HashSet<>();
                    if(map.containsKey(cur[j])) set = map.get(cur[j]);
                    if(!set.contains(next[j])){
                        set.add(next[j]);
                        map.put(cur[j], set);
                        degree.put(next[j], degree.get(next[j]) + 1);
                    }
                    break;
                }
            }
        }
        
        Queue<Character> queue = new LinkedList<Character>();
        
        for(char ch : degree.keySet()){
            if(degree.get(ch) == 0)
                queue.offer(ch);
        }
        
        while(!queue.isEmpty()){
            char c = queue.poll();
            sb.append(c);
            if(map.containsKey(c)){
                for(char ch : map.get(c)){
                    degree.put(ch, degree.get(ch) - 1);
                    if(degree.get(ch) == 0)
                        queue.offer(ch);
                }                
            }
        }
        if(sb.toString().length() == degree.size())
            return sb.toString();
        else return "";
        
        
    }
}