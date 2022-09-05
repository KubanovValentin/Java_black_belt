package hierarchy_of_collections.list.arrayList.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
}

class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Valentin");
        arrayList1.add("Nastya");
        arrayList1.add("Matvei");
        arrayList1.add("Sofia");
//        System.out.println("изначальный arrayList1 = " + arrayList1);
        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("====================================================");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Vasek");
        arrayList2.add("Nata");
        arrayList2.add("Valentin");
        arrayList2.add("Sofa");
        arrayList2.add("Matvei");
//        System.out.println("изначальный arrayList2 = " + arrayList2);
        Iterator<String> iterator2 = arrayList2.iterator();
        while (iterator2.hasNext()){
            iterator2.next();//получаем элемент
            iterator2.remove();//удаляем элемент
        }
        System.out.println("arrayList2 = " + arrayList2);
    }
}