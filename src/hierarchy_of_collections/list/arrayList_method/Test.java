package hierarchy_of_collections.list.arrayList_method;

import java.util.ArrayList;

public class Test {
}

class ArrayListMethod {
    public static void main(String[] args) {
        System.out.println("====================метод add=================");
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valentin");
        arrayList1.add("Nastya");
        arrayList1.add("Matvei");
        arrayList1.add("Sofia");
        arrayList1.add(0, "моя 7я : ");
        for (String s : arrayList1) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("=============================метод get=======================");
        System.out.println("---выыодим с помощью лупа----");
        for (int i = 1; i < arrayList1.size(); i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
        System.out.println();
        System.out.println("---выыодим с помощью метода get----");
        System.out.println(arrayList1.get(0));
        System.out.println("=============================метод set=======================");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(13);
        arrayList2.add(15);
        arrayList2.add(10);
        System.out.println(arrayList2);
        arrayList2.set(1,324);
        System.out.println(arrayList2);
        System.out.println("=============================метод remove=======================");
        arrayList2.remove(1);
        System.out.println(arrayList2);


    }
}