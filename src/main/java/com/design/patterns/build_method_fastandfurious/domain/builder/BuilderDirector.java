package com.design.patterns.build_method_fastandfurious.domain.builder;

public class BuilderDirector {
    public void builderToyota(IVehicleBuilder builder) {
        builder
                .chasis("Toyota")
                .engine("V8")
                .upholstery("Leather")
                .color("Red")
                .assemblyDate("2021-01-01")
                .assemblyNumber("123456");
    }

    public void builderMazda(IVehicleBuilder builder) {
        builder
                .chasis("Mazda")
                .engine("V6")
                .upholstery("Cloth")
                .color("Blue")
                .assemblyDate("2021-01-02")
                .assemblyNumber("654321");
    }

    public void builderFord(IVehicleBuilder builder) {
        builder
                .chasis("Ford")
                .engine("V4")
                .upholstery("Leather")
                .color("Black")
                .assemblyDate("2021-01-03")
                .assemblyNumber("456123");
    }
}
