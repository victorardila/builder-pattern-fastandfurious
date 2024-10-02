package com.design.patterns.build_method_fastandfurious.domain;

public class Vehicle {
    private String color;
    private String assemblyDate;
    private String assemblyNumber;

    public Vehicle(String color, String assemblyDate, String assemblyNumber) {
        this.color = color;
        this.assemblyDate = assemblyDate;
        this.assemblyNumber = assemblyNumber;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public void setAssemblyNumber(String assemblyNumber) {
        this.assemblyNumber = assemblyNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", assemblyDate='" + assemblyDate + '\'' +
                ", assemblyNumber='" + assemblyNumber + '\'' +
                '}';
    }
}
