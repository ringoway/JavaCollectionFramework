package Map.LinkedHashMap;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();

        myLinkedHashSet.add("Hello");
        myLinkedHashSet.add("my");
        myLinkedHashSet.add("name");
        myLinkedHashSet.add("is");
        myLinkedHashSet.add("Egor");

        for(String i: myLinkedHashSet) {
            System.out.print(i+" ");
        }
    }
}
