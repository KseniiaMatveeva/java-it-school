/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.repository;

import com.mycompany.motel1864.domain.Room;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author kseni
 */
@Repository
public class RoomJdbcRepository implements RoomRepository{

    private final JdbcTemplate jdbcTemplate;
    
    @Autowired
    public RoomJdbcRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    @Override
    public Collection<Room> findAll() {
        return jdbcTemplate.query("SELECT * FROM person",
                (rs, rowNum) -> new Room(rs.getString("room"),rs.getInt("id")));
    }
    
}
