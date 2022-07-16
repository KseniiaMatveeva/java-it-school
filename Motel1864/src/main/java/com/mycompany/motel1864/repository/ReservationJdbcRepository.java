/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.repository;

import com.mycompany.motel1864.domain.Reservation;
import com.mycompany.motel1864.domain.Room;
import java.util.Collection;
import javax.xml.crypto.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kseni
 */
@Repository
public class ReservationJdbcRepository implements ReservationRepository{

    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public ReservationJdbcRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public Collection<Reservation> findAll() {
        return jdbcTemplate.query("SELECT * FROM reservation",
            (rs, rowNum) -> new Reservation(rs.getString("FIO"), rs.getInt("roomId"), rs.getInt("reservationId"),
                     rs.getInt("personNum"), (Data) rs.getDate("data"),
                    rs.getString("phoneNumber"), rs.getInt("price"), rs.getString("whereFrom")));
    }
    
    @Override
    public void save(Reservation reservation) {
        jdbcTemplate.update("INSERT INTO reservation(FIO, room, personNum,"
                + " phoneNumber, price, whereFrom)VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                reservation.getFIO(),reservation.getRoomId(), reservation.getReservationId(), reservation.getPersonNum(), reservation.getData(),
                reservation.getPhoneNumber(), reservation.getPrice(),
                reservation.getWhereFrom());
    }

}

    