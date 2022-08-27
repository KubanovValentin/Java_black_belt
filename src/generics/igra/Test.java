package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Иван", 13);
        Schoolar schoolar2 = new Schoolar("Мария", 14);
        Schoolar schoolar3 = new Schoolar("Вова", 15);
        Schoolar schoolar4 = new Schoolar("Саша", 12);

        Student student1 = new Student("Николай", 20);
        Student student2 = new Student("Ксения", 18);
        Student student3 = new Student("Василиса", 17);
        Student student4 = new Student("Петр", 19);

        Employee employee1 = new Employee("Валентин", 44);
        Employee employee2 = new Employee("Анастасия", 33);
        Employee employee3 = new Employee("Василий", 37);
        Employee employee4 = new Employee("Катерина", 40);

        Team<Schoolar> schoolarTeam1 = new Team<>("Тупаки");
        Team<Schoolar> schoolarTeam2 = new Team<>("Умняки");
        Team<Student> studentTeam1 = new Team("Очикарики");
        Team<Student> studentTeam2 = new Team("Дурики");
        Team<Employee> employeeTeam1 = new Team("Работяги");
        Team<Employee> employeeTeam2 = new Team("Трутни");

        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        studentTeam1.addNewParticipant(student1);
        studentTeam1.addNewParticipant(student2);
        studentTeam2.addNewParticipant(student3);
        studentTeam2.addNewParticipant(student4);

        employeeTeam1.addNewParticipant(employee1);
        employeeTeam1.addNewParticipant(employee2);
        employeeTeam2.addNewParticipant(employee3);
        employeeTeam2.addNewParticipant(employee4);
        schoolarTeam1.playWith(schoolarTeam2);
        studentTeam1.playWith(studentTeam2);
        employeeTeam1.playWith(employeeTeam2);
    }
}
