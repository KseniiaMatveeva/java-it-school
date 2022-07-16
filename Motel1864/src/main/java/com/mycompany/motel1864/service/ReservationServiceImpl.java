/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.service;

import com.mycompany.motel1864.domain.Reservation;
import com.mycompany.motel1864.repository.ReservationRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kseni
 */
@Service
public class ReservationServiceImpl implements ReservationService {
    
    private final ReservationRepository reservationRepository;
    
    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Collection<Reservation> getAllRoom() {
        return reservationRepository.findAll();
    }

    @Override
    public void createReservation(Reservation reserv) {
        reservationRepository.save(reserv);
    }
    
}
