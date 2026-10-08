package Arrays.ArrayList.SeatReservationSystem.Controller;



import Arrays.ArrayList.SeatReservationSystem.Model.Seat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {



        // List to store bookings
        private List<Seat> bookedSeatsList;
        // Constructor
        public SeatBooking() {
            // Initialize the list of booked seats
            // TODO 1 : this.bookedSeatsList = ?
            this.bookedSeatsList = new ArrayList<>();
        }
        // Method to add a new seat booking
        public void addNewBooking(String seatNumber) {
            // TODO 2: check if the seat is already booked and not canceled
            for (Seat seat : bookedSeatsList){
                if (seat.getSeatNumber().equals(seatNumber) && seat.isBooked() && !seat.isCanceled()){
                    System.out.println(seatNumber+"seat is already booked please choose other seat!");
                    return;
                }

            }
            // TODO 3 create a new Seat object for the booking,
            Seat newSeat = new Seat(seatNumber);
            // mark the seat as booked,
            newSeat.setBooked(true);
            newSeat.setBookingDate(new Date());
            // set the current date as the booking date
            // TODO 4: add the new seat to the bookedSeatsList
            bookedSeatsList.add(newSeat)  ;
            // TODO 5: confirm the booking to the user
            System.out.println("Seat " + seatNumber + " has been successfully booked!"

            );
        }
        // Method to cancel a booking
        public void cancelBooking(String seatNumber) {
            // TODO 6: iterate through the list of booked seats
            boolean found = false;
            for (Seat seat : bookedSeatsList){
                if (seat.getSeatNumber().equals(seatNumber) && seat.isBooked() && !seat.isCanceled()){
                    seat.setBooked(false);
                    seat.setCanceled(true);
                    System.out.println(seatNumber+" seat is successfully cancelled");
                    found = true;
                    return;
                }

            }
            if (!found)
                System.out.println(seatNumber+" seat booking was not found");
            // TODO 7: check if the seat number matches and is not already canceled
            // mark the seat as canceled
            // mark the seat as not booked
            // confirm the cancellation to the user
            // TODO 8: inform the user if no booking was found for the seat number

        }
        // Method to update a booking seat number
        public void updateBooking(String oldSeatNumber, String newSeatNumber) {
            // TODO 9: iterate through the list of booked seats
            boolean found = false;
            for (Seat seat : bookedSeatsList){
                if (seat.getSeatNumber().equals(newSeatNumber)  && !seat.isCanceled() && seat.isBooked()) {
                    System.out.println(newSeatNumber + " seat is already booked!");

                    return;

                }
                if (seat.getSeatNumber().equals(oldSeatNumber)  && !seat.isCanceled() && seat.isBooked()){
                    seat.setSeatNumber(newSeatNumber);
                    System.out.println(oldSeatNumber + " seat was updated to "+ newSeatNumber);
                    found = true;
                    return;
                }

            }
            if (!found)
                System.out.println(oldSeatNumber + " seat was not found "   );
            // TODO 10: check if the seat number matches the old seat number and is not canceled
            // TODO 11: update the seat number to the new seat number
            // confirm the update to the user
            // TODO 12: inform the user if no booking was found for the old seat number
        }
        // Method to display all bookings
        public void displayBookings() {
            // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
            // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
            // TODO 15: display the seat number and booking date
            if (bookedSeatsList.isEmpty()) System.out.println("there has been no booking yet");

            for (Seat seat : bookedSeatsList){
                if (seat.isBooked() && !seat.isCanceled()){
                    System.out.println("Seat Number : " + seat.getSeatNumber());
                    System.out.println("Seat Booking Date : " + seat.getBookingDate());
                }
            }

        }
    }

