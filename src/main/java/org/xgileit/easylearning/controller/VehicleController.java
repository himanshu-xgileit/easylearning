package org.xgileit.easylearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.xgileit.easylearning.entity.VehicleEntity;
import org.xgileit.easylearning.model.dto.VehicleDetail;
import org.xgileit.easylearning.service.VehicleServiceImpl;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@RestController
@RequestMapping("/vehicle")
public class VehicleController {


 @Autowired
 private VehicleServiceImpl vehicleService;
    /**
     * @param vehicleEntity
     * @return
     */
    @PostMapping("/vehicle")

    private ResponseEntity<VehicleEntity> addVehicle(@RequestBody VehicleEntity vehicleEntity)
    {
        try {
            vehicleService.addVehicle(vehicleEntity);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

  @GetMapping("/vehicles")
  public ResponseEntity<List<VehicleEntity>> getAllVehicle(){
      try {
          return new ResponseEntity<>(vehicleService.getAllVehicle(),HttpStatusCode.valueOf(200));
      }
      catch (Exception e){
          return new ResponseEntity<>(HttpStatusCode.valueOf(500));
      }
  }

    @GetMapping("/vehicle1")
    public ResponseEntity<Optional<VehicleEntity>> getVehicleById(@RequestParam(value = "vehicleId") Long id){
        return new ResponseEntity<>(vehicleService.getVehicleById(id),HttpStatusCode.valueOf(200));

    }
    @PutMapping(value = "/vehicle")
    public ResponseEntity updateVehicleData(@RequestBody VehicleEntity vehicleEntity){
        try {
            vehicleService.updateVehicleData(vehicleEntity);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }

    @DeleteMapping(value = "/vehicle")
    public ResponseEntity updateUserData(@RequestParam(value = "vehicleId") Long userId){
        try {
            vehicleService.deleteVehicle(userId);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatusCode.valueOf(500));
        }
    }
}
