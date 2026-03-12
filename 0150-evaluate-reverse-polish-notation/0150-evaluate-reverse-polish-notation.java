class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int a,b;
                if(s.equals("+")){
                    stack.push(stack.pop()+stack.pop());
                }
                else if(s.equals("-")){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a-b);
                }
                else if(s.equals("/")){
                    b=stack.pop();
                    a=stack.pop();
                    stack.push(a/b);
                }
                if(s.equals("*")){
                    stack.push(stack.pop()*stack.pop());
                }
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}