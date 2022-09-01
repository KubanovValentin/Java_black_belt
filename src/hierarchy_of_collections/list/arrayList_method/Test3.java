package hierarchy_of_collections.list.arrayList_method;

import java.util.ArrayList;

public class Test3 {

}

class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        arrayList1.add("Valentin");
        arrayList1.add("Nastya");
        arrayList1.add("Matvei");
        arrayList1.add("Sofia");
        arrayList4.addAll(arrayList1);
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add(":(");
        arrayList2.add(":)");
        ArrayList<String> arrayList3 = new ArrayList<>();

        System.out.println("====================addAll===================");
        arrayList3.addAll(arrayList2);
        arrayList1.addAll(0, arrayList2);
        System.out.println(arrayList1);
        System.out.println("====================clear===================");
        System.out.println(arrayList3);
        arrayList3.clear();
        System.out.println(arrayList3);
        System.out.println("====================indexOf==================");
        System.out.println(arrayList1);
        int index = arrayList1.indexOf("Matvei");
        System.out.println("Matvei" + "-indexOf " + index);
        System.out.println("====================size==================");
        System.out.println(arrayList1.size());
        System.out.println("====================isEmpty==================");
        System.out.println("empty arrayList1 - " + arrayList1.isEmpty());
        System.out.println("empty arrayList3 - " + arrayList3.isEmpty());
        System.out.println("====================contains==================");
        System.out.println("contains arrayList1 'Matvei'- " + arrayList1.contains("Matvei"));
        System.out.println("contains arrayList1 'Vova'- " + arrayList1.contains("Vova"));
        System.out.println("====================toString==================");
        System.out.println(arrayList4.toString());
    }
}