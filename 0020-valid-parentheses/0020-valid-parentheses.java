class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(c=='(' || c=='{' || c=='['){
        //         stck.push(c);
        //     }
        //     else{
        //         if(stck.isEmpty()){
        //             return false;
        //         }
        //         char top=stck.pop();
        //         if (c == ')' && top != '(') return false;
        //         if (c == '}' && top != '{') return false;
        //         if (c == ']' && top != '[') return false;
        //     }
        // }
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
        
}
