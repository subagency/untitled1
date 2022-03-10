import java.time.LocalDate;
import java.time.Month;

public class CiclesOne {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2001,01,11);

        int year = data.getYear();
        Month mont = data.getMonth();
        int day = data.getDayOfMonth();
        System.out.println(mont + "day" + year);
        System.out.println(day);
    }

}

