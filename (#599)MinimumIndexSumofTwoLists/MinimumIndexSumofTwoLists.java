class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> res = new ArrayList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        int min = list1.length + list2.length;
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int index1 = map.get(list2[i]);
                if(index1 + i == min){
                    res.add(list2[i]);
                }else if(index1 + i < min){
                    res.clear();
                    res.add(list2[i]);
                    min = index1 + i;
                }
            }
        }
        String resArr[] = new String[res.size()];
        int index = 0;
        for(String str : res)
            resArr[index++] = str;
        return resArr;
        
    }
}