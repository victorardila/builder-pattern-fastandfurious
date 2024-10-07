package com.design.patterns.build_method_fastandfurious.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.build_method_fastandfurious.domain.builder.BuilderDirector;
import com.design.patterns.build_method_fastandfurious.domain.builder.IVehicleBuilder;
import com.design.patterns.build_method_fastandfurious.domain.builder.VehicleBuilder;

@RestController
@RequestMapping("/")
public class VehicleControllerDirector {
    @GetMapping("list/")
    public List<VehicleBuilder> getVehicles() {
        BuilderDirector director = new BuilderDirector();
        IVehicleBuilder builder = new VehicleBuilder.VehicleConcreteBuilder();
        List<VehicleBuilder> vehicles = new ArrayList<>();

        director.builderToyota(builder);

        VehicleBuilder vehicleA = builder.color("Red")
                .engine("V8")
                .chasis("Toyota")
                .upholstery("Leather")
                .assemblyDate("2021-01-01")
                .assemblyNumber("123456")
                .build();
        vehicles.add(vehicleA);

        director.builderMazda(builder);

        VehicleBuilder vehicleB = builder.color("Blue")
                .engine("V6")
                .chasis("Mazda")
                .upholstery("Cloth")
                .assemblyDate("2021-01-02")
                .assemblyNumber("654321")
                .build();
        vehicles.add(vehicleB);

        director.builderFord(builder);

        VehicleBuilder vehicleC = builder.color("Black")
                .engine("V4")
                .chasis("Ford")
                .upholstery("Leather")
                .assemblyDate("2021-01-03")
                .assemblyNumber("456123")
                .build();

        vehicles.add(vehicleC);

        return vehicles;
    }
}
