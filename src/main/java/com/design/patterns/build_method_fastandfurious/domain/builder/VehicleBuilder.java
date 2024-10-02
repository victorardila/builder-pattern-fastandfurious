package com.design.patterns.build_method_fastandfurious.domain.builder;

public class VehicleBuilder {
    private String chasis;
    private String engine;
    private String upholstery;
    private String color;
    private String assemblyDate;
    private String assemblyNumber;

    private VehicleBuilder(
            String chasis,
            String engine,
            String upholstery,
            String color,
            String assemblyDate,
            String assemblyNumber) {
        this.chasis = chasis;
        this.engine = engine;
        this.upholstery = upholstery;
        this.color = color;
        this.assemblyDate = assemblyDate;
        this.assemblyNumber = assemblyNumber;
    }

    private VehicleBuilder(
            String chasis,
            String engine,
            String upholstery,
            String assemblyDate,
            String assemblyNumber) {
        this.chasis = chasis;
        this.engine = engine;
        this.upholstery = upholstery;
        this.assemblyDate = assemblyDate;
        this.assemblyNumber = assemblyNumber;
    }

    public VehicleBuilder setChasis(String chasis) {
        this.chasis = chasis;
        return this;
    }

    public VehicleBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public VehicleBuilder setUpholstery(String upholstery) {
        this.upholstery = upholstery;
        return this;
    }

    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleBuilder setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
        return this;
    }

    public VehicleBuilder setAssemblyNumber(String assemblyNumber) {
        this.assemblyNumber = assemblyNumber;
        return this;
    }

    @Override
    public String toString() {
        return "VehicleBuilder{" +
                "chasis='" + chasis + '\'' +
                ", engine='" + engine + '\'' +
                ", upholstery='" + upholstery + '\'' +
                ", color='" + color + '\'' +
                ", assemblyDate='" + assemblyDate + '\'' +
                ", assemblyNumber='" + assemblyNumber + '\'' +
                '}';
    }

    public static class VehicleConcreteBuilder extends VehicleBuilder {
        private String chasis;
        private String engine;
        private String upholstery;
        private String color;
        private String assemblyDate;
        private String assemblyNumber;

        @Override
        public VehicleConcreteBuilder setChasis(String chasis) {
            this.chasis = chasis;
            return this;
        }

        @Override
        public VehicleConcreteBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public VehicleConcreteBuilder setUpholstery(String upholstery) {
            this.upholstery = upholstery;
            return this;
        }

        @Override
        public VehicleConcreteBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        @Override
        public VehicleConcreteBuilder setAssemblyDate(String assemblyDate) {
            this.assemblyDate = assemblyDate;
            return this;
        }

        @Override
        public VehicleConcreteBuilder setAssemblyNumber(String assemblyNumber) {
            this.assemblyNumber = assemblyNumber;
            return this;
        }

        public VehicleBuilder build() {
            return new VehicleBuilder(
                    chasis,
                    engine,
                    upholstery,
                    color,
                    assemblyDate,
                    assemblyNumber);
        }
    }
}
