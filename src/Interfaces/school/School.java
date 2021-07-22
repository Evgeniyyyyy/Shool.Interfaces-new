package Interfaces.school;


import static Interfaces.school.ISalary.FOR_TC_PER_WEEK;
import static Interfaces.school.test.Assert.aAssert;

public class School {
   private static final String LINE = "________________________________________________";
    private static final double EXPECTED_BASE_SALARY = 1440;
    private static final double EXPECTED_PAY_CHECK = 4172;

    public static void main(String[] Args) {
        Student student1 = new Student("Masha", "Ivanova", 'F', 10, "Student", 5);
        System.out.println(student1.getGender());
        Student student2 = new Student("Vova", "Sidorov", 'F', 12, "Student", 7);
        System.out.println(student1.getGender());


        Parent parent1 = new Parent("Elsa", "Browdy", 'F', 32, "Parent",
                1235363265265L, student1);
        //     System.out.println(parent1.getFirstName() + " " + parent1.getPhoneNumber());

        Parent parent2 = new Parent("Bob", "Lol", 'M', 37, "Parent",
                1235363444445L, student1);
        //    System.out.println(parent1.getFirstName() + " " + parent1.getPhoneNumber());

        Parent parent3 = new Parent("Andrey", "Colt", 'M', 31, "Parent",
                133363444447L, student2);
        //    System.out.println(parent1.getFirstName() + " " + parent1.getPhoneNumber());

        Teacher teacher1 = new Teacher("Mary", "Ivanova", 'F', 31, "Teacher",
                "Literature", 36, FOR_TC_PER_WEEK);
        Parent[] parents = new Parent[]{parent1, parent2, parent3};

        System.out.println(LINE);


       /* student1.printParent(parents);
        System.out.println(LINE);
        parent1.printParent();
        System.out.println(LINE);
        teacher1.printTeacher();*/
        double actualBaseSalary = teacher1.getBaseSalary();

        aAssert(EXPECTED_BASE_SALARY, teacher1.getBaseSalary());
        aAssert(EXPECTED_PAY_CHECK, teacher1.getSalary());

        System.out.println(teacher1.getSalaryPerMonth());
        System.out.println(teacher1.getSTaxes());


    }

}
