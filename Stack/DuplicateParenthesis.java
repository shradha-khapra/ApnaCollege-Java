import java.util.Stack;

public class DuplicateParenthesis {

    public static boolean Validity(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')' && s.peek() == '(') {
                return true;
            }
            if (str.charAt(i) != ')') {
                s.push(str.charAt(i));
            } else {
                if (s.isEmpty()) {
                    return false;
                }
                while (s.peek() != '(') {
                    s.pop();
                }
                s.pop();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+(b))+(c+d)))"; // True
        String str2 = "((a+(b))+(c+d))"; // False
        System.out.println(Validity(str));
        System.out.println(Validity(str2));
    }
}
