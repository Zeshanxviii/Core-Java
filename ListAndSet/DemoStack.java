package ListAndSet;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        s.push("1");
        s.push("2");
        s.push("3");

        for(String str : s){
            System.out.println(str);
        }

    }
}
