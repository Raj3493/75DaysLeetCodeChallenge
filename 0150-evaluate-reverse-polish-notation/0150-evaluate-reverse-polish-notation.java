class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens){
            try{
                int num=Integer.parseInt(s);
                stack.push(num);
            }catch(NumberFormatException e){
                int b=stack.pop();
                int a=stack.pop();
                switch(s){
                    case "+":stack.push(a+b);break;
                    case "-":stack.push(a-b);break;
                    case "/":stack.push(a/b);break;
                    case "*":stack.push(a*b);break;
                }
            }
        }
        return stack.peek();
    }
}