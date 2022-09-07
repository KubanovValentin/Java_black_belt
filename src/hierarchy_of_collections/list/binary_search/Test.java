package hierarchy_of_collections.list.binary_search;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
}

class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-20);
        arrayList.add(130);
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(100);
        arrayList.add(-10);
        arrayList.add(-240);
        arrayList.add(0);
        arrayList.add(3);
        arrayList.add(65);
        arrayList.add(13);
        arrayList.add(34);
        arrayList.add(1);
        System.out.println("неотсортированный arrayList = " + arrayList);
        int count = 1;
        for (Integer i : arrayList) {
            if (i == 4) {
                break;
            }
            count++;
        }
        System.out.println(count);
        Collections.sort(arrayList);

        System.out.println("отсортированный arrayList = " + arrayList);
        int index1 = Collections.binarySearch(arrayList, 13);
        System.out.println(index1);
        System.out.println("============reverse=================");
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        System.out.println("============shuffle=================");
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }


}