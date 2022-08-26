package generics.parameterized_class;
//value не может быть static
//E используется в работе с ArrayList(List и т.д)(Map)
//K используется в работе с ключами (Map ключ/значение)
//V используется в работе с валуе (Map значение/ключ)
//T хранитель типа(тайвесхолдер) временно исполняет значения типа, который потом будет заменен на нужный
public class Test {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("hello");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println("--->  " + s);
        Info<Integer> info2 = new Info<>(13);
        System.out.println(info2);
        Integer i = info2.getValue();
        System.out.println("--->  " + i);
    }
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