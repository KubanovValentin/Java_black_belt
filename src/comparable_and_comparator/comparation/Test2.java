package comparable_and_comparator.comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        Employee emp1=new Employee(78,"Valentin","Kubanov",3000);
        Employee emp2=new Employee(89,"Anastasiya","Kubanova",2000);
        Employee emp3=new Employee(17,"Matvei","Kubanov",5000);
        Employee emp4=new Employee(21,"Sofiya","Kubanova",2500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        System.out.println("before sort\n"+list);
        Collections.sort(list);
        System.out.println("after sort\n"+list);
    }
}
class Employee implements Comparable<Employee>{
    //int id;//для 1 и 2 способа
    //Integer id;//для 3 способа
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id==anotherEmp.id){
            return 0;
        }else if (this.id<anotherEmp.id){
            return -1;
        }else {
            return 1;
        }
        /*1 способ
        if (this.id==anotherEmp.id){
            return 0;
        }else if (this.id<anotherEmp.id){
            return -1;
        }else {
            return 1;
        }
         */
        //----------------------
        /*2 способ распространенный
        return this.id-anotherEmp.id;
         */
        //----------------------
        /*3 способ
        return this.id.compareTo(anotherEmp.id);//более редкий способ
         */
        //----------------------
        /*4 способ(но так как фамилии одинаковые надо проверять следующим способом)
         return this.surname.compareTo(anotherEmp.surname);
         */
        //----------------------
        /*5 способ(но так как фамилии одинаковые надо проверять следующим способом)
        int res= this.surname.compareTo(anotherEmp.surname);
        if (res==0){
            res=this.name.compareTo(anotherEmp.name);
        }
        return res;
         */

    }
}