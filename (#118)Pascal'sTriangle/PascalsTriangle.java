class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<numRows; i++){
            list.add(0, 1);
            for(int j = 1; j < list.size() - 1; j++){
                list.set(j, list.get(j) + list.get(j+1));
            }
            allList.add(new ArrayList<Integer>(list));
        }
        
        return allList;
    }
}
