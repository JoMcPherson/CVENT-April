package org.example;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.getColor());
        slowRide.drive();
    }
}