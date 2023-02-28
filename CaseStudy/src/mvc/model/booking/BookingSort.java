package mvc.model.booking;

import java.util.Comparator;

public class BookingSort implements Comparator<Booking> {


    @Override
    public int compare(Booking o1, Booking o2) {
        if(o2.getStartDate().equals(o1.getStartDate())){
            return o2.getLateDate().compareTo(o1.getLateDate());
        }
        return o2.getStartDate().compareTo(o1.getStartDate());
    }
}
