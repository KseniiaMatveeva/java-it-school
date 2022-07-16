/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.service;

import com.mycompany.motel1864.domain.Reservation;
import com.mycompany.motel1864.domain.Room;
import java.util.Collection;
import java.util.Map;

/**
 *
 * @author kseni
 */
public interface ReservationService {
    
    Map <Integer, Collection<Reservation>> getAllRoom();
    public void createReservation(Reservation reservation);

}
