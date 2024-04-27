package com.joshi.Design.Pattern.parkingLotDesign.entity;

import lombok.Data;

@Data
public class Ticket {
    long entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
}
