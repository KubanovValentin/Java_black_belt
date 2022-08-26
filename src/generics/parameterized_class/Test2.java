package generics.parameterized_class;

public class Test2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 13);
        System.out.println(" значение value1 = " + pair1.getFirstValue() + "\n значение value2 = "+pair1.getSecondValue());
        System.out.println("----------------------");
        Pair<Double,Integer> pair2 = new Pair<>(123.54, 2);
        System.out.println(" значение value1 = " + pair2.getFirstValue() + "\n значение value2 = "+pair2.getSecondValue());
        System.out.println("----------------------");
        OtherPair<String> otherPair=new OtherPair<>("ok","by");
        System.out.println(" значение value1 = " + otherPair.getFirstValue() + "\n значение value2 = "+otherPair.getSecondValue());
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}