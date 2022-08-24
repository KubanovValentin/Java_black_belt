package comparable_and_comparator.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Valentin");
        list.add("Zaur");
        list.add("Sveta");
        System.out.println("before sort");
        System.out.println(list);
        System.out.println("after sort");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("--------------------------------");
        List<Integer> listNumber=new ArrayList<>();
        listNumber.add(1);
        listNumber.add(3);
        listNumber.add(6);
        listNumber.add(0);
        listNumber.add(2);
        listNumber.add(5);
        listNumber.add(13);
        System.out.println(listNumber);
        Collections.sort(listNumber);
        System.out.println(listNumber);
    }
}
