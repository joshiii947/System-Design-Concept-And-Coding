package com.joshi.Design.Pattern.parkingLotDesign.entity;

import lombok.Data;

@Data
public class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private int price;
    private VehicleType vehicleType;
}
