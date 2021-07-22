package Interfaces.school;

public interface ISalary {
    int BASE_HOURS_SET = 18;
    int TEACHER_COUNSELOR = 1;
    int TEACHER_TUTOR = 2;
    double FOR_TC_PER_WEEK = 50;
    double HOURLY_WAGE_FOR_TEACHER = 40;
    double TAX_PERCENTAGE = 30/100;

    double getBaseSalary();
    double getSalaryPerMonth();
    double getSalary();
    default double getSTaxes(){
        return getSalaryPerMonth() * TAX_PERCENTAGE;
    }


    // обычная раб неделя 40 часов
    // 2 ставки = 36 часов 1.5 ставки = 27 ч, 1 ставка = 18ч
    // класс руководитель 50 дол
}


