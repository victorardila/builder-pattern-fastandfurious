package com.design.patterns.build_method_fastandfurious.domain.builder;

public interface IVehicleBuilder {
    IVehicleBuilder color(String color);

    IVehicleBuilder assemblyDate(String assemblyDate);

    IVehicleBuilder assemblyNumber(String assemblyNumber);

    IVehicleBuilder chasis(String chasis);

    IVehicleBuilder engine(String engine);

    IVehicleBuilder upholstery(String upholstery);

    VehicleBuilder build();
}
