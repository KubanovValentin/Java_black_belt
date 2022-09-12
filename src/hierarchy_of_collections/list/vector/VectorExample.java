package hierarchy_of_collections.list.vector;

import java.util.Vector;
//не советуется пользоваться классом Vector
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Валентин");
        vector.add("Миша");
        vector.add("Саша");
        vector.add("Коля");
        vector.add("Таня");
        vector.add("Настя");
        System.out.println(vector);
        System.out.println("=========================firstElement()===================================");
        System.out.println(vector.firstElement());
        System.out.println("=========================lastElement()===================================");
        System.out.println(vector.lastElement());
        System.out.println("=========================remove(2)===================================");
        vector.remove(2);
//        System.out.println(vector.remove(2));
        System.out.println(vector);
        System.out.println("=========================get(1)===================================");
        System.out.println(vector.get(1));
    }
}
