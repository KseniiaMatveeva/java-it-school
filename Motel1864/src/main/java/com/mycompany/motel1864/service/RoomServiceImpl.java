/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.service;

import com.mycompany.motel1864.domain.Room;
import com.mycompany.motel1864.repository.RoomRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kseni
 */
@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    
    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
   
    @Override
    public Collection<Room> getAllRoom() {
        return  roomRepository.findAll();
    }
   
}
