package LC;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValidParenthesis("({[abc]})"));
        System.out.println(findArea(2,3));
    }

    public static boolean isValidParenthesis(String s){

        Deque<Character> chStack = new ArrayDeque<>(s.length());
        s = s.replaceAll("[A-Za-z]", "");
        for(char c : s.toCharArray()){
            if(c == '{'){
                chStack.push('}');
            }else if(c == '('){
                chStack.push(')');
            }else if(c == '['){
                chStack.push(']');
            }else if(chStack.isEmpty() || chStack.pop() != c){
                return false;
            }
        }
        return chStack.isEmpty();
    }

    public static int findArea(int a, int b){
        if(a < 0 || b<0) return 0;
        return (findArea(a+1, b) + findArea(a-1, b)+ findArea(a, b+1)+ findArea(a, b-1) + 1);
    }



}
