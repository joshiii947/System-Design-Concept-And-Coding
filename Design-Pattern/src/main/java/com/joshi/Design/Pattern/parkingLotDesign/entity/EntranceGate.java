package com.joshi.Design.Pattern.parkingLotDesign.entity;

import com.joshi.Design.Pattern.parkingLotDesign.factory.ParkingManagerFactory;
import com.joshi.Design.Pattern.parkingLotDesign.service.ParkingSpotManager;
import lombok.Data;

@Data
public class EntranceGate {

    ParkingManagerFactory parkingManagerFactory;

    ParkingSpotManager parkingSpotManager;

    Ticket ticket;
}
