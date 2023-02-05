package mvc.model.booking;

import java.util.Comparator;

public class BookingSort implements Comparator<Booking> {


    @Override
    public int compare(Booking o1, Booking o2) {
        return o1.getStartDate().compareTo(o2.getStartDate());
    }
}
