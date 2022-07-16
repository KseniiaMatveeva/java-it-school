/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.controller;

import com.mycompany.motel1864.domain.Room;
import com.mycompany.motel1864.service.RoomService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kseni
 */
@RestController
@RequestMapping("/motel1864/rooms")
public class RoomController {
    
    private Collection<Room> room = new ArrayList<>(
                Arrays.asList(new Room("студия 1", 1),new Room("студия 2", 2)
                ,new Room("студия 3", 3),new Room("студия 4", 4),new Room("студия 5", 5),new Room("стандартный 1", 6)
                ,new Room("стандартный 2", 7),new Room("стандартный 3", 8),new Room("стандартный 4", 9)
                ,new Room("люкс зеелный", 10),new Room("люкс серый", 11),new Room("аппартамент", 12)
                ,new Room("бунгало", 13),new Room("бюджет 3х", 14),new Room("бюджет 4х", 15)
                ));
    
    private final RoomService roomService;
    
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }
    
    /*@GetMapping
    public Collection<Room> getRoom(){
        return room;
    }*/
}
