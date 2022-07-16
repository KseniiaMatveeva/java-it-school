/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.service;

import com.mycompany.motel1864.domain.Reservation;
import com.mycompany.motel1864.domain.Room;
import com.mycompany.motel1864.repository.ReservationRepository;
import com.mycompany.motel1864.repository.RoomRepository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kseni
 */
@Service
public class ReservationServiceImpl implements ReservationService {
    
    private final ReservationRepository reservationRepository;
    
    private final RoomRepository roomRepository;
    
    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository, RoomRepository roomRepository){
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
    }

    public Map <Integer, Collection<Reservation>> getAllRoom() {
        Map <Integer, Collection<Reservation>> tContent = new HashMap<>();
        Room room = (Room) roomRepository.findAll();
        Reservation reservation = (Reservation) reservationRepository.findAll();
        while(room.getId() == reservation.getRoomId()){
            tContent.put(room.getId(), reservationRepository.findAll());
        }
        return tContent;
    }
    @Override
    public void createReservation(Reservation reserv) {
        reservationRepository.save(reserv);
    }
}
