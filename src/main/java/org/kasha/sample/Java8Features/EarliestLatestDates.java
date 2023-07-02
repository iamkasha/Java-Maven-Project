package org.kasha.sample.Java8Features;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class EarliestLatestDates {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(2023, 1, 15));
        dates.add(LocalDate.of(2023, 4, 22));
        dates.add(LocalDate.of(2023, 3, 8));
        dates.add(LocalDate.of(2023, 2, 1));

        LocalDate earliestDate = dates.stream()
                .min((date1, date2) -> date1.compareTo(date2))
                .orElse(null);

        LocalDate latestDate = dates.stream()
                .max(LocalDate::compareTo)
                .orElse(null);

        System.out.println("Earliest date: " + earliestDate);
        System.out.println("Latest date: " + latestDate);
    }
}

