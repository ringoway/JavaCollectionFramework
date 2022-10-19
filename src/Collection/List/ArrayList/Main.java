package Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList - класс, который реализует динамический массив.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<6; i++) {
            int x = 4;
            x = x*i ;
            list.add(x);
        }
//        System.out.println(array);
//        System.out.println(array.get(0)+" "+array.get(5));
//        System.out.println(array.size());
        list.remove(4); //очень неэффективен

        for (int i = 0; i< list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        for (Integer z: list){
            System.out.print(z+" ");
    }
        //мы проводим много удалений из нашего листа.
        list = new LinkedList<>();

}}
