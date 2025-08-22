package model.entities;

import model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException(" Check-out date must be before check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public long duration() {
        Duration diff = Duration.between( checkIn.atStartOfDay(), checkOut.atStartOfDay()); //diferença das duas datas
        return diff.toDays();
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) {

        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) { //verificação se a data é válida, caso não seja, irá criar uma exceção a partir da invalidade
            throw new DomainException("Reservation dates for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)) {
           throw new DomainException(" Check-out date must be before check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return " Room "
                + roomNumber
                + ", check-in: "
                +  checkIn.format(dtf)
                + ", check-out: "
                +  checkOut.format(dtf)
                + ", "
                + duration()
                + " nights";
    }
}
