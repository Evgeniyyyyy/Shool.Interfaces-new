package Interfaces.school;

public final class Student extends BasePerson {
    private int grade;

    Student(String firstName, String lastName, char gender, int age, String status, int grade) {
        super(firstName, lastName, gender, age, status);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void printParent(Parent[] parents) {

        for (Parent parent : parents) {
            if (parent.getStudent().equals(this)) {
                System.out.println();
                System.out.println("Student: " + getFirstName() + " " + getLastName() + " " + getGrade());
                System.out.println("Parent: " + parent.getFirstName() + " " + parent.getLastName() + " " +
                        "Phone number: " + parent.getPhoneNumber());
            }
        }
    }
}
    /*public void printParent() {
        System.out.println();
        System.out.println(getFirstName() + " " + getLastName() + ", is parent of Student: " + getFirstName() +
                " " + getLastName() + ", grade of student: " + getGrade() + " ");
        System.out.println("Parent's phone number: " + getPhoneNumber());
    }*/

    /*@Override
    public void setAge(int age) {
        if (age > 0) {
            this.setAge(age);
        }

    }

    @Override
    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            super.setGender(gender);

        } else {
            System.out.println("Error");
        }
    }*/




