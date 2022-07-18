package RentedFilm;

import java.util.Comparator;

public class DateTimeComparator implements Comparator<DateTime> {

    @Override
    public int compare(DateTime dt1, DateTime dt2) {
        if(Integer.compare(dt1.year, dt2.year) == -1 || Integer.compare(dt1.month, dt2.month) == -1 || Integer.compare(dt1.day, dt2.day) == -1 || Integer.compare(dt1.hours, dt2.hours) == -1 || Integer.compare(dt1.minutes, dt2.minutes) == -1 || Integer.compare(dt1.seconds, dt2.seconds) == -1) {
            return -1;
        } else if (Integer.compare(dt1.year, dt2.year) == 1 && Integer.compare(dt1.month, dt2.month) == 1 && Integer.compare(dt1.day, dt2.day) == 1 && Integer.compare(dt1.hours, dt2.hours) == 1 && Integer.compare(dt1.minutes, dt2.minutes) == 1 && Integer.compare(dt1.seconds, dt2.seconds) == 1) {
            return 1;
        } else {
            return 0;
        }

    }
}
