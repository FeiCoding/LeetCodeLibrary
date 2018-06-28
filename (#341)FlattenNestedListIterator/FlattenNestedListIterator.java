public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> stack = new Stack<NestedInteger>();
    
    public NestedIterator(List<NestedInteger> nestedList) {
        for(int i = nestedList.size() - 1; i >= 0; --i){
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stack.isEmpty()){
            NestedInteger nest = stack.peek();
            if(nest.isInteger()){
                return true;
            }     
            stack.pop();
            for(int i = nest.getList().size() - 1; i >= 0; i--){
                stack.push(nest.getList().get(i));
            }
        }
        return false;
       
    }
}