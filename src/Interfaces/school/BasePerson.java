package Interfaces.school;

public abstract class BasePerson {
    private String firstName;
    private String  lastName;
    private char gender;
    private int age;
    private String status;
    private static int countPerson;
    private static String schoolName;

    BasePerson(String firstName, String  lastName, char gender, int age, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.setGender(gender);
        this.age = age;
        this.status = status;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

  //  public abstract void setAge(int age);

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        BasePerson.schoolName = schoolName;
    }


}
