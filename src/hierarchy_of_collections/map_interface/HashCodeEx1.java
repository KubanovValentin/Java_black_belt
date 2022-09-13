package hierarchy_of_collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Valentin", "Kubanov", 3);
        Student st2 = new Student("Nastasiya", "Kubanova", 5);
        Student st3 = new Student("Matvei", "Kubanov", 1);
        map.put(st1, 5.6);
        map.put(st2, 8.9);
        map.put(st3, 7.9);
        System.out.println(map);

        Student st4 = new Student("Valentin", "Kubanov", 3);
        Student st5 = new Student("Andrei", "Kubanov", 2);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println("======================hashCode()===================================");
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());
        System.out.println(st5.hashCode());
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
       return Objects.hash(name, surname, course);
 //       return name.length()*7 + surname.length()*11 + course*53;
    }
}