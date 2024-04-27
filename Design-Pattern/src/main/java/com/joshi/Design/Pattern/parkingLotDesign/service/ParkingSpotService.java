package com.joshi.Design.Pattern.parkingLotDesign.service;

import com.joshi.Design.Pattern.parkingLotDesign.entity.Vehicle;

public interface ParkingSpotService {

    void parkVehicle(Vehicle vehicle);

    void removeVehicle(Vehicle vehicle);

}
