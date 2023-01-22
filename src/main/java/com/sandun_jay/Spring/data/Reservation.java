package com.sandun_jay.Spring.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "RESERVATION_ID")
    private Long rID;
    @Column (name = "ROOM_ID")
    private String roomId;
    @Column (name = "GUEST_ID")
    private long guestId;
    @Column (name = "RES_date")
    private Date reservationDate;

    public Long getrID() {
        return rID;
    }

    public void setrID(Long rID) {
        this.rID = rID;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getrDate() {
        return reservationDate;
    }

    public void setrDate(Date rDate) {
        this.reservationDate = rDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "rID=" + rID +
                ", roomId='" + roomId + '\'' +
                ", guestId=" + guestId +
                ", rDate=" + reservationDate +
                '}';
    }
}
