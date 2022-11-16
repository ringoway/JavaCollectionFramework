package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("Hello");
        myHashSet.add("my");
        myHashSet.add("name");
        myHashSet.add("is");
        myHashSet.add("Egor");

        myHashSet.add("my");

        for(String i: myHashSet){System.out.print(i+" ");}
        System.out.println();

        TreeSet<Integer> myTreeSet = new TreeSet<>();

        myTreeSet.add(4);
        myTreeSet.add(3);
        myTreeSet.add(30);
        myTreeSet.add(999);
        myTreeSet.add(1);

        for(int i: myTreeSet){System.out.print(i+" ");}
        System.out.println();


    }
}
