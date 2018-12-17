package hw01.view;

// import java.util.Scanner;

import hw01.controller.VehicleList;
import hw01.util.*;

public class MainClass {

    public static void main(String[] args) {
        VehicleList vehicles = new VehicleList();
        for (int i = 0; i < 15; i++) {
            vehicles.add(VehicleFactory.randVehicle());
        }
        VehicleList swimmingVehicles = VehicleFactory.GetSwimmable(vehicles);
        Insertion.SortByPrice(swimmingVehicles);
        swimmingVehicles.print();
        VehicleList ridingVehicles = VehicleFactory.GetRideable(vehicles);
        VehicleList flyingVehicles = VehicleFactory.GetFlyable(vehicles);
        System.out.println(VehicleFactory.MaxSpeed(swimmingVehicles));
        System.out.println(VehicleFactory.MaxSpeed(ridingVehicles));
        System.out.println(VehicleFactory.MaxSpeed(flyingVehicles));
    }
}