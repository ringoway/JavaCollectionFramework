package Collection.List.ArrayList;

import java.util.ArrayList;

//ArrayList - класс, который реализует динамический массив.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i<6; i++) {
            int x = 4;
            x = x*i ;
            array.add(x);
        }
        System.out.println(array);
        System.out.println(array.get(0)+" "+array.get(5));
        System.out.println(array.size());
    }
}
