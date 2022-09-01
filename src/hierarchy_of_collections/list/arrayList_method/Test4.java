package hierarchy_of_collections.list.arrayList_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
}

class ArrayListMethod4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list= Arrays.asList(array);
        System.out.println(list);
        StringBuilder sb5 = new StringBuilder("T");
  //      list.add(sb5);
        array[0]=new StringBuilder("F");
        array[0].append("!!!");
        System.out.println(list);
    }
}