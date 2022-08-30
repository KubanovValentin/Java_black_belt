package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Number> numberList = new ArrayList<Integer>();// писать нельзя
//        List<Object> numberList = new ArrayList<Integer>();// писать нельзя
        //wildcard- (? символ )
        //означает что вместо  (? символ ) может стоят и Integer и Object и String
        //List<?> супер тип для любого ArrayList
        //-------------------------------------------------------
        //bounded wildcard
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();
        //--------------------------------------------------------

        List<?> numberList = new ArrayList<Integer>();
        List<Double> list1=new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        System.out.println("----------------------------------");
        List<String> list2=new ArrayList<>();
        list2.add("привет");
        list2.add("пока");
        list2.add("споки");
        list2.add("люлю");
        showListInfo(list2);
        System.out.println("----------------------------------");
        ArrayList<Double> ald=new ArrayList<>();
        ald.add(1.14);
        ald.add(2.15);
        ald.add(3.16);
        System.out.println(summ(ald));
        System.out.println("----------------------------------");
        ArrayList<Integer> ali=new ArrayList<>();
        ali.add(13);
        ali.add(133);
        ali.add(123);
        ali.add(156);
        ali.add(-545);
        System.out.println(summ(ali));
    }

    static void showListInfo(List<?> list) {
        System.out.println("мой list содержит следующие элементы : " + list);
    }
    public static double summ(ArrayList<? extends Number>aL){
        double summ=0;
        for (Number n:aL){
            summ+=n.doubleValue();
        }
        return summ;
    }
}
