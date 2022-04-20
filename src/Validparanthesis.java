import java.util.Stack;

public class Validparanthesis {


    public static void main(String[] args) {
        if(isValid("{")){
            System.out.println("true");
        }else{
            System.out.println("false");

        }
    }


    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack();
        for(char c: s.toCharArray()) {
            if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
