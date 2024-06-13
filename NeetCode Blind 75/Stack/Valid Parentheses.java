class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if(s.charAt(0)=='(' ||s.charAt(0)=='{'||s.charAt(0)=='['){
            stack.push(s.charAt(0));
        }
        else{
            return false;
        }
        for(int i=1;i<=s.length()-1;i++){
            try{
                if(s.charAt(i)==')' && stack.peek()=='('){
                    stack.pop();
                }
                else if(s.charAt(i)=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                else if(s.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            catch(Exception e){
                return false;
            }
            
        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
