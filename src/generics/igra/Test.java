package generics.igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);
        Schoolar schoolar3 = new Schoolar("Ivan3", 11);
        Schoolar schoolar4 = new Schoolar("Maria4", 11);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Jaroslav", 38);
        Employee employee2 = new Employee("Mikhail", 47);

        Team <Schoolar> schoolarTeam = new Team<>("Dragon");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
        Team <Student> studentTeam = new Team<>("Student");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
//        Team <String> anotherTeam = new Team<>("Student");

        Team <Schoolar> schoolarTeam2 = new Team<>("Mudretsi");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

//        schoolarTeam.playWith(studentTeam);
        schoolarTeam.playWith(schoolarTeam);

    }
}
