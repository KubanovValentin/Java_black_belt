package generics.subtyping;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        X x = new Y();
        List<X> xList = new ArrayList<X>();
        List<Number> numberList = new ArrayList<>();
        numberList.add(15);
        numberList.add(3.6);
        numberList.add(-34);
        System.out.println("--------------------------");
 //       InfoNumber<Integer> i = new InfoNumber<>(13);
//        System.out.println(i.getValue());
//        InfoNumber<Double> d = new InfoNumber<>(2.45);
 //       System.out.println(d.getValue());
    }
}

class X {
}

class Y extends X {
}

class InfoNumber<T extends Number&I1&I2> {
    private T value;

    public InfoNumber(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

interface I1 {
}

interface I2 {
}