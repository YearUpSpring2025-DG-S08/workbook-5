package com.pluralsight;

import com.pluralsight.vehicles.Moped;
import com.pluralsight.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
    
        Moped slowRide = new Moped();
//        slowRide.setColor("Blue");
//        slowRide.setFuelCapacity(12);
        
        Vehicle v = new Vehicle();
        v.setColor("Yellow");
        System.out.println(v.color);
        
        System.out.println(slowRide.color);
//        System.out.println(slowRide.getFuelCapacity());
        
        
        
//        Car muscleCar = new Car();
//        muscleCar.setColor("Red");
//        muscleCar.setFuelCapacity(15);
//
//        System.out.println(muscleCar.getColor());
//        System.out.println(muscleCar.getFuelCapacity());
    }
}