package ds.stacks;

public class StringReversal {
    public static StringBuffer reverse(StringBuffer str) {
        int strlen = str.length();
        StackImplementation.Stack stack = new StackImplementation.Stack();
//        Stack<Object> stack= new Stack<>();

        for (int i = 0; i < strlen; i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }

        for (int i = 0; i < strlen; i++) {
            char ch = (char) stack.pop();
            str.setCharAt(i, ch);
        }
        return str;
    }

    public static void main(String[] args) {
//        StringReversal rstr = new StringReversal();
        StringBuffer sb= new StringBuffer("a b c d");
//            reverse(sb);
        System.out.println(reverse(sb));
    }
}