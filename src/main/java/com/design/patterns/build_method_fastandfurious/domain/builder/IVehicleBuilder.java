package com.design.patterns.build_method_fastandfurious.domain.builder;

public interface IVehicleBuilder {
    IVehicleBuilder setChasis(String chasis);

    IVehicleBuilder setEngine(String engine);

    IVehicleBuilder setUpholstery(String upholstery);

    IVehicleBuilder setColor(String color);

    IVehicleBuilder setAssemblyDate(String assemblyDate);

    IVehicleBuilder setAssemblyNumber(String assemblyNumber);

    VehicleBuilder build();
}
