package com.design.patterns.build_method_fastandfurious.domain.builder;

public class VehicleBuilder {
    private String chasis;
    private String engine;
    private String upholstery;
    private String color;
    private String assemblyDate;
    private String assemblyNumber;

    // Constructor con parámetros
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

    // Constructor sin color
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

    // Metodos setter
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setUpholstery(String upholstery) {
        this.upholstery = upholstery;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public void setAssemblyNumber(String assemblyNumber) {
        this.assemblyNumber = assemblyNumber;
    }

    // Metodos getter
    public String getChasis() {
        return chasis;
    }

    public String getEngine() {
        return engine;
    }

    public String getUpholstery() {
        return upholstery;
    }

    public String getColor() {
        return color;
    }

    public String getAssemblyDate() {
        return assemblyDate;
    }

    public String getAssemblyNumber() {
        return assemblyNumber;
    }

    // Metodo para construir el objeto
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

    // Clase concreta (builder)
    public static class VehicleConcreteBuilder implements IVehicleBuilder {
        private String chasis;
        private String engine;
        private String upholstery;
        private String color;
        private String assemblyDate;
        private String assemblyNumber;

        public VehicleConcreteBuilder() {

        }

        @Override
        public IVehicleBuilder color(String color) {
            this.color = color;
            return this;
        }

        @Override
        public IVehicleBuilder chasis(String chasis) {
            this.chasis = chasis;
            return this;
        }

        @Override
        public IVehicleBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        @Override
        public IVehicleBuilder upholstery(String upholstery) {
            this.upholstery = upholstery;
            return this;
        }

        @Override
        public IVehicleBuilder assemblyDate(String assemblyDate) {
            this.assemblyDate = assemblyDate;
            return this;
        }

        @Override
        public IVehicleBuilder assemblyNumber(String assemblyNumber) {
            this.assemblyNumber = assemblyNumber;
            return this;
        }

        @Override
        public VehicleBuilder build() {
            return new VehicleBuilder(
                    this.chasis,
                    this.engine,
                    this.upholstery,
                    this.color,
                    this.assemblyDate,
                    this.assemblyNumber);
        }
    }
}
