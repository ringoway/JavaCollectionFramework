package Map.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(8011819, "Шашлыков Иван Дмитриевич");
        passportsAndNames.put(8016218, "Купатов Илья Маратович");
        passportsAndNames.put(8018625, "Колбасков Игорь Русланович");

        passportsAndNames.put(8018519, "Маринадов Николай Иванович");
        passportsAndNames.put(8019718, "Утков Глеб Кириллович");
        passportsAndNames.put(8015675, "Рыбков Олег Захарович");
        passportsAndNames.put(8014619, "Баранов Кирилл Ильич");
        passportsAndNames.put(8016818, "Листков Иван Азатович");
        passportsAndNames.put(8018025, "Салатов Данил Иванович");
        passportsAndNames.put(8013819, "Помидоров Богдан Сабирович");
        passportsAndNames.put(8015238, "Баклажанов Руслан Макарович");
        passportsAndNames.put(8016531, "Кабачков Дмитрий Богданович");

        passportsAndNames.putAll(passportsAndNames2);

        System.out.println(passportsAndNames);

//        String igorName = passportsAndNames.get(8017819);
//        System.out.println(igorName);
//        passportsAndNames.remove(8018625);
//        System.out.println(passportsAndNames);

        System.out.println(passportsAndNames.containsKey(8019236));
        System.out.println(passportsAndNames.containsValue("Купатов Илья Маратович"));

        Set<Integer> keys = passportsAndNames.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Значения: " + values);

        System.out.println(passportsAndNames.size());


    }
}
