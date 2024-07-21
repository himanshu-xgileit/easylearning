package org.xgileit.easylearning.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class VehicleDetail {

    public String vehicleId;
    public String vehicleYear;
    private String vehicleType;
    private String vehiclePrice;
    private String vehicleName;
    private String vehicleMake;


}
