package com.driver;

public class Boat implements WaterVehicle{

    public String name;
    private int capacity;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public  Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
