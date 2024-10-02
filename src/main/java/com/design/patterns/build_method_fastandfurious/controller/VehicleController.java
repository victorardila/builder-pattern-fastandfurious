package com.design.patterns.build_method_fastandfurious.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.build_method_fastandfurious.domain.Vehicle;
import com.design.patterns.build_method_fastandfurious.domain.builder.IVehicleBuilder;
import com.design.patterns.build_method_fastandfurious.domain.builder.VehicleBuilder;

@RestController
@RequestMapping("/")
public class VehicleController {

    @GetMapping
    public Vehicle getVehicle() {
        IVehicleBuilder builder = new VehicleBuilder();
        builder.color("Red")
                .engine("V8")
                .chasis("Chasis")
                .upholstery("Leather")
                .assemblyDate("2021-01-01")
                .assemblyNumber("123456");
    }
}
