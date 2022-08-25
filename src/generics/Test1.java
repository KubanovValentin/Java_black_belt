package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

//        List list = new ArrayList();// List list содержит обьекты(так не стоит писать,нужно работать с параметрами,ниже)
        List <String>list = new ArrayList<>();
//        так практически никто не делает
//        list.add("ok");
//        list.add(5);
//        list.add("ok");
//        list.add(new StringBuilder("hello"));
//        list.add(new Car());
        //ротайп(сырой тип) так писать не стоит
        list.add("hai");
        list.add("frog");
        list.add("by");
        list.add("hellou");
        for (String o : list) {
            System.out.println(o + " - dlina etogo slova "+((String)o).length());
        }
    }
}

class Car {
}