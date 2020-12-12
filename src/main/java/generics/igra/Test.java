package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan",13);
        Schoolar schoolar2 = new Schoolar("Mariya",15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Alexandr", 41);
        Employee employee2 = new Employee("Mikhail", 47);

        Team <Schoolar> schoolarTeam = new Team<>("Drakony");
        Team <Student> studentTeam = new Team<>("Vpered");
        Team <Employee> employeeTeam = new Team<>("Robotyagi");
//        Team <String> s = new Team<>("Robotyagi");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
//        schoolarTeam.addNewParticipant(student1);
//        schoolarTeam.addNewParticipant(student2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team <Schoolar> schoolarTeam2 = new Team<>("Mudretci");

        Schoolar schoolar3 = new Schoolar("Sergey",13);
        Schoolar schoolar4 = new Schoolar("Olya",15);

        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);
        schoolarTeam2.playWith(schoolarTeam);

    }
}
