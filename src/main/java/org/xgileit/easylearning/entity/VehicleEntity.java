package org.xgileit.easylearning.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="vehicle_detail")
@Data
public class VehicleEntity {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vehicle_name")
    private String vehicleName;
    @Column(name = "vehicle_year")
    public String vehicleYear;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "vehicle_price")
    private String vehiclePrice;
    @Column(name = "vehicle_make")
    private String vehicleMake;
}
