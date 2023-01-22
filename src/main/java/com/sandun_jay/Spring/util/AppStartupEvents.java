package com.sandun_jay.Spring.util;

import com.sandun_jay.Spring.data.Guest;
import com.sandun_jay.Spring.data.Reservation;
import com.sandun_jay.Spring.data.GuestRepository;
import com.sandun_jay.Spring.data.ReservationRepository;
import com.sandun_jay.Spring.data.Room;
import com.sandun_jay.Spring.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class AppStartupEvents implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    public AppStartupEvents(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void onApplicationEvent (ApplicationReadyEvent event){
        Iterable<Room> rooms= this.roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests= this.guestRepository.findAll();
        guests.forEach(System.out::println);
        Iterable<Reservation> reservations= this.reservationRepository.findAll();
        reservations.forEach(System.out::println);
    }

}
