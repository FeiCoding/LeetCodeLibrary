class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int first;
        int second;
        for(String ch : tokens){
            if(ch.equals("+")){
                first = stack.pop();
                second = stack.pop();
                stack.push(second + first);
            }
            else if(ch.equals("-")){
                first = stack.pop();
                second = stack.pop();
                stack.push(second - first);
            }
            else if(ch.equals("*")){
                first = stack.pop();
                second = stack.pop();
                stack.push(second * first);
            }
            else if(ch.equals("/")){
                first = stack.pop();
                second = stack.pop();
                stack.push(second / first);
            }
            else{
                stack.push(Integer.valueOf(ch));
            }
        }
        return stack.pop();
    }
}