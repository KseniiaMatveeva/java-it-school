/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.controller;

import com.mycompany.motel1864.domain.Reservation;
import com.mycompany.motel1864.service.ReservationService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kseni
 */
@RestController
@RequestMapping("/motel1864/reservations")
public class ReservationController {

    private Collection<Reservation> reservation = new ArrayList<>();
    
    private final ReservationService reservationService;
    
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }
    
    @GetMapping
    public Collection<Reservation> getReservation(){
        return reservation;
    }
    
    @PostMapping
    public Collection<Reservation> setReservation(@RequestBody @Valid Reservation reserv){
        reservation.add(reserv);
        reservationService.createReservation(reserv);
        return reservation;
    }
}
