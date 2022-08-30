package generics.type_erasure;
//TYPE ERASURE

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    }
//     public void abc(Info<String> info){
//        String s=info.getValue();
//     }
//    public void abc(Info<Integer> info){
//        Integer i=info.getValue();
//    }


}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
    //при  использовании дженериков надо подходить с особой осторожностью
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}