package hierarchy_of_collections.list.arrayList_method;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
}

class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valentin");
        arrayList1.add("Nastya");
        arrayList1.add("Matvei");
        arrayList1.add("Sofia");
        System.out.println("изначальный arrayList1 = " + arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Vasek");
        arrayList2.add("Nata");
        arrayList2.add("Valentin");
        arrayList2.add("Sofa");
        arrayList2.add("Matvei");
        System.out.println("изначальный arrayList2 = " + arrayList2);
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList3.add("Valentin");
        arrayList3.add("Nastya");
        arrayList3.add("Matvei");
        arrayList3.add("Sofia");
        arrayList3.add("Vasek");
        arrayList3.add("Nata");
        arrayList3.add("Sofa");
        System.out.println("изначальный arrayList3 = " + arrayList3);
        System.out.println("========================removeAll=============================");
        arrayList2.removeAll(arrayList1);
        System.out.println("применили метод removeAll к arrayList2 и удалили все элементы arrayList1 = " + arrayList2);
        System.out.println("========================retainAll=============================");
        arrayList3.retainAll(arrayList2);
        System.out.println("применили метод retainAll к arrayList3 и оставили только " +
                "элементы(единственные и не общие с другими arrayList) arrayList2 = " + arrayList3);
        System.out.println("========================containsAll=============================");
        boolean result = arrayList3.containsAll(arrayList2);
        System.out.println("с помощью containsAll проверяем содержит ли arrayList3 все элементы arrayList2 = " + result);
        System.out.println("========================subList=============================");
        System.out.println("имеющийся  arrayList1 с элементами = " + arrayList1);
        List<String> myList = arrayList1.subList(1, 3);
        System.out.println("из arrayList1 создаем myList методом subList(элементы 1 и 2) и получаем = " + myList);
        System.out.println("========================toArray=============================");
        Object[] array = arrayList1.toArray();//массив array содержит все элементы arrayList1
        System.out.println("с помощью метода toArray заносим в Object[]array все элементы arrayList1");
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            System.out.println("выводим " + count + ".элемент Object[]array = " + array[i] + " ");
            count++;
        }
        System.out.println("========================toArray создание массива=============================");
        String[] array2 = arrayList3.toArray(new String[0]);
        System.out.println("с помощью метода toArray создаем массив String[] array2 из элементов arrayList3");
        for (String s : array2) {
            System.out.print(s + " ");
        }
        System.out.println("========================List.of=============================");
        List<Integer> list1 = List.of(1, 2, 13, 657, 324, 5555);
        System.out.println("выводим созданный list1 с помощью List.of(без метода add) = " + list1);
        System.out.println("list1 - изменить его нельзя!добавить элементы нельзя!");
        System.out.println("========================List.copyOf=============================");
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println("выводим созданный list2 с помощью List.copyOf(без метода add) = " + list2);
        System.out.println("list2 - изменить его нельзя!добавить элементы нельзя!содержать значение null невозможно!");

    }
}