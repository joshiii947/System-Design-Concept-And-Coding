package com.joshi.Design.Pattern.parkingLotDesign.factory;

import com.joshi.Design.Pattern.parkingLotDesign.entity.VehicleType;
import com.joshi.Design.Pattern.parkingLotDesign.service.ParkingSpotManager;
import org.springframework.stereotype.Component;

@Component
public class ParkingManagerFactory {

    ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){

        return null;
    }
}
