package carrentalsystem.models;

import java.time.LocalDateTime;

public class Reservation {
    public static int id=101;
    Vehicle vehicle;
    User user;
    LocalDateTime reservationDate;
    LocalDateTime dateFrom;
    LocalDateTime dateTo;

    public Reservation(Vehicle vehicle, User user, LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.vehicle = vehicle;
        this.user = user;
        this.reservationDate = LocalDateTime.now();
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        id++;
    }

    public void printReservation(){
        System.out.println("Reservation ID: "+id);
        System.out.println("Vehicle Info: "+vehicle.getNumberPlate());
        System.out.println("User booked: "+user.getName());
        System.out.println("Reservation date: "+reservationDate);
        System.out.println("Reserved from: "+dateFrom);
        System.out.println("Reservation to: "+dateTo);
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reservation.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDateTime dateTo) {
        this.dateTo = dateTo;
    }
}
