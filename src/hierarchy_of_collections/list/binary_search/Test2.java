package hierarchy_of_collections.list.binary_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Валентин", 3500);
        Employee emp2 = new Employee(11, "Анастасия", 4500);
        Employee emp3 = new Employee(2, "Матвей", 5500);
        Employee emp4 = new Employee(1033, "София", 2500);
        Employee emp5 = new Employee(24, "Тимофей", 4500);
        Employee emp6 = new Employee(345, "Василиса", 3000);
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        employeesList.add(emp5);
        employeesList.add(emp6);
        System.out.println(employeesList);
        Collections.sort(employeesList);
        System.out.println(employeesList);
        int index2=Collections.binarySearch(employeesList,new Employee(24, "Тимофей", 4500));
        System.out.println(index2);
        System.out.println("=================================================================");
        int []array={-3,2,9,10,-9,13,89,35,27,-34,0,45};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3=Arrays.binarySearch(array,89);
        System.out.println(index3);


    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}