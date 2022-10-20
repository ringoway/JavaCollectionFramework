package Collection.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("man");
        list.add("!");
        list.remove(1);
        list.add(1, "world");


        System.out.println(list);
    }
}
