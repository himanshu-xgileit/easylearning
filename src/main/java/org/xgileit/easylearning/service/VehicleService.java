package org.xgileit.easylearning.service;

import org.xgileit.easylearning.entity.VehicleEntity;

import java.util.List;
import java.util.Optional;

public interface  VehicleService {
    VehicleEntity addVehicle(VehicleEntity vehicleEntity);
    List<VehicleEntity> getAllVehicle();
    VehicleEntity updateVehicleData(VehicleEntity userEntity);
    Optional<VehicleEntity> getVehicleById(Long id);
    void deleteVehicle(Long id);
}
