package org.kasha.sample.Java8Features;
import java.time.LocalDate;
import java.time.Period;
public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate birthdate = LocalDate.of(1998, 6, 1);

        LocalDate currentDate = LocalDate.now();

        int age = calculateAge(birthdate, currentDate);

        System.out.println("Age: " + age);
    }

    public static int calculateAge(LocalDate birthdate, LocalDate currentDate) {
        Period period = Period.between(birthdate, currentDate);

        int years = period.getYears();

        if (currentDate.isBefore(birthdate.plusYears(years))) {
            years--;
        }
        return years;
    }
}

