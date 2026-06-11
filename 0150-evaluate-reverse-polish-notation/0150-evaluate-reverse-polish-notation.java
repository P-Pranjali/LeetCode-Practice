class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> queue = new ArrayDeque<>();

        for(String token : tokens){

            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){

                int b = queue.pop();
                int a = queue.pop();


                if(token.equals("+")){

                    queue.push(a+b);
                }

               else if(token.equals("-")){
                    queue.push(a-b);
                }

               else if(token.equals("*")){
                    queue.push(a*b);
                }
               else if(token.equals("/")){
                    queue.push(a/b);
                }
            }

            else{
                queue.push(Integer.parseInt(token));
            }
        }
          return queue.pop();
    }
}