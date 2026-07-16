import java.util.*;

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (char ch : s.toCharArray()) {
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack.push(ch);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }

//                 char top = stack.pop();

//                 if ((ch == ')' && top != '(') ||
//                     (ch == '}' && top != '{') ||
//                     (ch == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }

//         return stack.isEmpty();
//     }
// }

class Solution{
public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> pairs = new HashMap<>();
    pairs.put('(' ,')');
    pairs.put('{' , '}');
    pairs.put('[', ']');
    
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '['){
            stack.push(c);
        }
    
    else if(stack.isEmpty()) {return false;}

    else if(pairs.get(stack.peek()) == c) {stack.pop();}
    else {return false;}
    }
     return stack.isEmpty();
}
}