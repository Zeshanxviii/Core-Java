package ListAndSet;

import java.util.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        ArrayList<String> list0 = new ArrayList<>();


        list.add(1);
        list.add(1);
        list.add(2);
        list.add("hello");
        list0.add("list0");
        list0.addAll(list);
        System.out.println(list0);
        System.out.println(list);

    }
}
