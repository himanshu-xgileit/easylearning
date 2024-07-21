package org.xgileit.easylearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xgileit.easylearning.entity.VehicleEntity;
import org.xgileit.easylearning.entity.VehicleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService{
    @Autowired
    VehicleRepository vehicleRepository;

    public VehicleEntity addVehicle(VehicleEntity vehicleEntity) {
        return vehicleRepository.save(vehicleEntity);
    }
    public List<VehicleEntity> getAllVehicle() {
        return vehicleRepository.findAll();
    }




    public VehicleEntity updateVehicleData(VehicleEntity vehicleEntity) {
        return vehicleRepository.save(vehicleEntity);
    }

    @Override
    public Optional<VehicleEntity> getVehicleById(Long id) {
        return vehicleRepository.findById(id);
    }


    public void deleteVehicle(Long id) {
         vehicleRepository.deleteById(id);
    }
}
