/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.repository;

import com.mycompany.motel1864.domain.Room;
import java.util.Collection;

/**
 *
 * @author kseni
 */
public interface RoomRepository {
    
    Collection<Room> findAll();
    
}
