package listExamples;

import java.util.Stack;

public class Stackexample {
    public static void main(String[] args) {
        Stack<String> stak1 = new Stack<>();
        //insert the element in stack - LIFO
        stak1.push("abcd");
        stak1.push("abcde");
        stak1.push("abcdf");
        stak1.push("abcdg");
        System.out.println("stack is "+stak1);

        // remove element
        stak1.pop();
        System.out.println("after first pop +"+stak1);
    }
}
