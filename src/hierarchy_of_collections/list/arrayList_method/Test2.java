package hierarchy_of_collections.list.arrayList_method;

import java.util.ArrayList;
import java.util.Objects;

public class Test2 {
}

class ArrayListMethod2 {
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 'м', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'м', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'ж', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'м', 35, 4, 7);
        Student st5 = new Student("Мария", 'ж', 23, 3, 7.4);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
//        studentList.add(st6);
        System.out.println(studentList);
        Student st6 = new Student("Мария", 'ж', 23, 3, 7.4);
        studentList.remove(st6);
        System.out.println(studentList);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя='" + name + '\'' +
                ", пол=" + sex +
                ", возраст=" + age +
                ", курс=" + course +
                ", средняя оценка=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

}