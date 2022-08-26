package generics.parameterized_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(34);
        al1.add(2);
        int a1 = GenMethod.getFirstElement(al1);
        int a2 = GenMethod.getSecondElement(al1);

        System.out.println(a1 + "," + a2);
        System.out.println("-------------------------------------------------");
        ArrayList<String> str1 = new ArrayList<>();
        str1.add("hello");
        str1.add("africa");
        str1.add("naturiya");
        String s2 = GenMethod.getSecondElement(str1);
        String s1 = GenMethod.getFirstElement(str1);
        System.out.println(s1 + " " + s2);

    }


}

class GenMethod {
    public static <T> T getFirstElement(ArrayList<T> al) {
        return al.get(0);
    }

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}