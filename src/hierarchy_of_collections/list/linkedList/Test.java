package hierarchy_of_collections.list.linkedList;

import java.util.LinkedList;

public class Test {
}
class LinkedListEx1{
    public static void main(String[] args) {
        Student2 st1 = new Student2("Иван", 2 );
        Student2 st2 = new Student2("Николай",  4);
        Student2 st3 = new Student2("Елена", 1);
        Student2 st4 = new Student2("Петр",  3);
        Student2 st5 = new Student2("Мария", 3);
        LinkedList<Student2> student2LinkedList=new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        Student2 st6 = new Student2("Валентин", 2);
        Student2 st7 = new Student2("Настасия", 1);
        Student2 st8=st1;
        System.out.println("LinkedList = "+student2LinkedList);
//        System.out.println(student2LinkedList.get(4));
        student2LinkedList.add(0,st6);
        student2LinkedList.add(1,st7);
        System.out.println("LinkedList = "+student2LinkedList);
        Student2 st9=st1;
        System.out.println(st8==st9);
        student2LinkedList.remove(4);
        System.out.println("LinkedList = "+student2LinkedList);


    }
}
class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}