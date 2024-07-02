package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<Asset> myAssets = new ArrayList<>();
        House mainHouse = new House("main house","1/1/2020",500000, "26 Chickadee Street",1,10,10);
        House lakeHouse = new House("lake house","1/1/2020",500000, "27 Blueberry Lane",1,10,10);
       Vehicle miata = new Vehicle("miata bb", "3/2/20", 10000,"maza miata",10,50000);
       Vehicle toyota = new Vehicle("normal car", "4/28/93",1000,"Toyota Corrola",3,8000);
        myAssets.add(mainHouse);
        myAssets.add(lakeHouse);
        myAssets.add(miata);
        myAssets.add(toyota);
        String message = "";
        for az
        if (myAssets.get(i) instanceof House) {
            House house = (House) myAssets.get(i);
            message = "House at " + house.getAddress();
        }
        else if (myAssets.get(i) instanceof Vehicle) {
            Vehicle vehcile = (Vehicle) myAssets.get(i);
            message = "Vehicle: " +
                    vehicle.getYear() + " " + vehicle.getMakeModel();
        }
    }
}