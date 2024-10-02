package com.design.patterns.build_method_fastandfurious.controller;

import java.lang.module.ModuleDescriptor.Builder;
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
        BuilderDirector builderDirector = new BuilderDirector();
        IVehicleBuilder builder = new VehicleBuilder.VehicleConcreteBuilder();
    }
}
