package gun4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateTime {

    public static void main(String[] args) {

        LocalDate today= LocalDate.now() ;

        System.out.println(today);//2023-01-14

        System.out.println(today.atTime(LocalTime.now()));//

        System.out.println(today.getDayOfYear());//


        LocalDate now=LocalDate.now();
        LocalDate birthday=LocalDate.of(1997,03,17);

        System.out.println(Period.between(now, birthday));//P-25Y-9M-28D


        //if we want to write specific order for date, we can use DateTimeFormatter.ofPattern

    }
}
