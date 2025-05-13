package com.pluralsight.vehicles;


public class Vehicle {
    protected int currentSpeed;
    protected int speedLimit;
    protected int relativeDirection;
    protected String color;
    protected int numberOfPassengers;
    protected int cargoCapacity;
    protected int fuelCapacity;
    
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
    
    public int getSpeedLimit() {
        return speedLimit;
    }
    
    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }
    
    public int getRelativeDirection() {
        return relativeDirection;
    }
    
    public void setRelativeDirection(int relativeDirection) {
        this.relativeDirection = relativeDirection;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
    
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
    
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
    
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}