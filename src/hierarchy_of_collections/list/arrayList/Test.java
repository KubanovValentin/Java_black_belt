package hierarchy_of_collections.list.arrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
}
class ArrayListEx1{
    public static void main(String[] args) {
        Test t=new Test();
        ArrayList<String> arrayList1=new ArrayList<String>();
 //     ArrayList<String> arrayList5=new ArrayList<>(); //можно так создать
 //     List<String> arrayList6=new ArrayList<>(); //можно так создать
 //     ArrayList<String> arrayList7=new ArrayList<>(arrayList5); //можно так создать
        arrayList1.add("Valentin");
        arrayList1.add("Nastasiya");
        arrayList1.add("Matvei");
        arrayList1.add("Sofiya");
        arrayList1.add("Timofei");
        arrayList1.add("Vasilisa");
        arrayList1.add("мы 7 я");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2=new ArrayList<>(200); //можно так создать размер листа 200 элементов
        arrayList2.add("1");
        arrayList2.add("4232");
        System.out.println(arrayList2.size());
        System.out.println(arrayList2);
        System.out.println("----------------------------------------------------------");
        ArrayList<String> arrayList3=new ArrayList<>(arrayList1);
        System.out.println(arrayList1.equals(arrayList3));
        System.out.println(arrayList1==arrayList3);
        arrayList3.sort(Comparator.naturalOrder());
        System.out.println(arrayList3);
        System.out.println(arrayList1.equals(arrayList3));
        System.out.println("----------------------------------------------------------");
        //так делать не стоит - всегда надо использовать дженерики
        ArrayList arrayList4=new ArrayList();
        arrayList4.add(5);
        arrayList4.add(new Car());
        arrayList4.add("qweqwewqe");
        arrayList4.add(t);

        System.out.println(arrayList4);
    }
}
class Car{}