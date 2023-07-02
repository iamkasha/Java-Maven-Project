package org.kasha.sample.Java8Features;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class NoOfBusinessDays {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 7, 3);
        LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

        int workingDays = 0;
        while (!startDate.isAfter(endDate)) {
            if (startDate.getDayOfWeek() != DayOfWeek.SATURDAY && startDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            startDate = startDate.plusDays(1);
        }

        System.out.println("Number of working days until the end of the month: " + workingDays);
    }
}

