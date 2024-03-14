package ListAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("cccc");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
//        System.out.println(list);

    }
}
