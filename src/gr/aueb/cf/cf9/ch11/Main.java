package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();


        Product milk = new Product(1L, "milk A", "light Milk", 1.5, 2, true);

        User user = new User();
        User andreas22 = new User( true, "Andreas", "Papadopoulos", "andrew", "12345", 1L );

        System.out.println(andreas22.getUsername());
        System.out.println(andreas22.isActive());

        Student student = new Student();
        Student alice = new Student();
        Student bob  = new Student();

        Student student2 = new Student(4,"MAKIS", "KAPETIS");
        student2.setFirstname("Xrisostomos");

          alice.setId(1);//setter
        alice.setFirstname("Alice");
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");


        System.out.println(alice.getId());  //getter
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());
        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(),alice.getFirstname(), alice.getLastname());
        System.out.println(Student.getStudentCount());
    }
}
