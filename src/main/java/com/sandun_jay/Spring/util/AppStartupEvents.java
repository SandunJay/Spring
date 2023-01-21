package com.sandun_jay.Spring.util;

import com.sandun_jay.Spring.data.Room;
import com.sandun_jay.Spring.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvents implements ApplicationListener<ApplicationReadyEvent> {

    private final RoomRepository roomRepository;

    public AppStartupEvents(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void onApplicationEvent (ApplicationReadyEvent event){
        Iterable<Room> rooms= this.roomRepository.findAll();
        rooms.forEach(System.out::println);
    }

}
