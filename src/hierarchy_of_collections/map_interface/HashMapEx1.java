package hierarchy_of_collections.map_interface;

import java.util.HashMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        System.out.println("============================HashMap<Integer, String>==================================");
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1978, "Valentin Kubanov");
        map1.put(1989, "Nastasiya Kubanova");
        map1.put(2017, "Matvei Kubanov");
        map1.put(2022, "Sofiya Kubanova");
        System.out.println("============================putIfAbsent==================================");
        map1.putIfAbsent(2022, "rwerwerwer Kubanova");//метод добавь если такого ключа нет
        map1.putIfAbsent(2023, "wewe Kubanova");
        System.out.println(map1);
        System.out.println("============================get==================================");
        System.out.println(map1.get(1989));
        System.out.println("============================remove==================================");
        System.out.println("удаляем ключ 2023");
        map1.remove(2023);
        System.out.println(map1);
        System.out.println("============================containsValue==================================");
        System.out.println("значение в коллекции map1 - Valentin Kubanov = " + map1.containsValue("Valentin Kubanov"));
        System.out.println("============================containsKey==================================");
        System.out.println("ключ в коллекции map1 - 1989 = " + map1.containsKey(1989));
        System.out.println("============================keySet==================================");
        System.out.println("показать все ключи в коллекции (возвращает множество ключей) : " + map1.keySet());
        System.out.println("============================values==================================");
        System.out.println("показать все значения в коллекции (возвращает множество значений) : " + map1.values());
        System.out.println("============================HashMap<String, String>==================================");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("жена", "Настасия");
        map2.put("сын", "Матвей");
        map2.put("дочка", "София");
        System.out.println(map2);
    }
}
