import java.util.*;

public class STACK1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(15);
        st.push(59);
        st.push(49);
        st.push(30);
        System.err.println(st + " ");
        System.err.println(st.peek());
        st.pop();
        System.err.println(st + " ");
        System.err.println(st.peek());
    }
 }