/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motel1864.domain;

import java.util.Collection;
import javax.validation.constraints.NotBlank;
import javax.xml.crypto.Data;

/**
 *
 * @author kseni
 */
public class Reservation {
    
    @NotBlank
    private String FIO;
    
    @NotBlank
    private Integer roomId;
    
    @NotBlank
    private Integer reservationId;
    
    @NotBlank
    private Room room;
    
    @NotBlank
    private Integer personNum;
    
    @NotBlank
    private Data data;
    
    @NotBlank
    private String phoneNumber;
    
    @NotBlank
    private Integer price;
    
    @NotBlank
    private String whereFrom;
    
    public Reservation(String FIO, Integer roomId, Integer reservationId, Integer personNum, Data data,
            String phoneNumber, Integer price, String whereFrom){
        this.FIO = FIO;
        roomId = room.getId();
        this.roomId = roomId;
        this.reservationId = reservationId;
        this.personNum = personNum;
        this.data = data;
        this.phoneNumber = phoneNumber;
        this.price = price;
        //this.room = room;
        this.whereFrom = whereFrom;
    }
    
    public void setFIO(String fio){
        this.FIO = fio;
    }
    
    public void setRoomId(Integer roomId){
        this.roomId = roomId;
    }
    
    public void setReservationId(Integer reservationId){
        this.reservationId = reservationId;
    }
    
    public void setData(Data data){
        this.data = data;
    }
    
    /*public void setRoom(Room room){
        this.room = room;
    }*/
    
    public void setPersonNum(Integer personNum){
        this.personNum = personNum;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setPrice(Integer price){
        this.price = price;
    }
    
    public void setWhereFrom(String whereFrom){
        this.whereFrom = whereFrom;
    }
    
    public String getFIO(){
        return FIO;
    }
    
    public Data getData(){
        return data;
    }
    
    public Integer getReservationId(){
        return reservationId;
    }
    
    public Integer getRoomId(){
        return roomId;
    }
    
    public Integer getPersonNum(){
        return personNum;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public Integer getPrice(){
        return price;
    }
    
    public String getWhereFrom(){
        return whereFrom;
    }
    
}
