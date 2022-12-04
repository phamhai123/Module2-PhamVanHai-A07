package mvc.service;

import mvc.model.Booking;

import java.util.TreeSet;

public class BookingServiceImpl implements BookingService{
    private static TreeSet<Booking> bookings = new TreeSet<>();

    public void display() {
        for (Booking booking: bookings
             ) {
            System.out.println(booking);
        }
    }

    @Override
    public void addBooking() {

    }

//    @Override
//    public void create() {
//
//    }
//
//    @Override
//    public void edit() {
//
//    }
//
//    @Override
//    public void delete() {
//
//    }
}
