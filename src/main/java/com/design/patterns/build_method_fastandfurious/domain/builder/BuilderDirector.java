package com.design.patterns.build_method_fastandfurious.domain.builder;

public class BuilderDirector {
    public void VehicleBuilder(IVehicleBuilder builder) {
        builder.setChasis("Chasis")
                .setEngine("Engine")
                .setUpholstery("Upholstery")
                .setColor("Color")
                .setAssemblyDate("Assembly Date")
                .setAssemblyNumber("Assembly Number")
                .build();
    }
}
