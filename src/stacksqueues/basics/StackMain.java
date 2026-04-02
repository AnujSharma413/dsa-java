package stacksqueues.basics;

/*
 * Driver class to test Stack and DynamicStack
 */

import stacksqueues.dynamic.DynamicStack;

public class StackMain {
    public static void main(String[] args) throws StackException {

        // Using DynamicStack (auto-resizing)
        DynamicStack st = new DynamicStack(5);

        // Push elements
        st.push(32);
        st.push(45);
        st.push(2);
        st.push(9);
        st.push(18);

        // This will trigger resizing
        st.push(19);

        // Operations
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}