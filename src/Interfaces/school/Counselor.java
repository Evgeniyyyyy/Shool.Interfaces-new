package Interfaces.school;

public class Counselor extends BaseAdministrator {
    public Counselor(String firstName, String lastName, char gender, int age, String status) {
        super(firstName, lastName, gender, age, status);
    }

    @Override
    public double getBaseSalary() {
        return 0;
    }

    @Override
    public double getSalaryPerMonth() {
        return 0;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public double getSTaxes() {
        return 0;
    }
}
