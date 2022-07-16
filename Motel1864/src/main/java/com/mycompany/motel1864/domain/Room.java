/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.domain;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author kseni
 */
public class Room {
    
    private String room;
    
    private static Integer id;
    
    public Room(String room, Integer id){
        this.room = room;
        this.id = id;
    }
    
    public String getRoom(){
        return room;
    }
    
    public static Integer getId(){
        return id;
    }
    
}
