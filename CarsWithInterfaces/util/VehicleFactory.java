package hw01.util;

import hw01.controller.VehicleList;
import hw01.model.*;

public class VehicleFactory {
    public static CVehicle getVehicle(int i){
        switch (i) {
            case 0: return new CCar((int) (Math.random()*11000 + 7000), (int) (Math.random()*80 + 150), (int) (Math.random()*20 + 2000));
            case 1: return new CBatMobile((int) (Math.random()*100000 + 150000), (int) (Math.random()*150 + 150), (int) (Math.random()*6 + 2012), (int) (Math.random()*300));
            case 2: return new CPlane((int) (Math.random()*11000 + 7000), (int) (Math.random()*80 + 150), (int) (Math.random()*20 + 2000), (int) (Math.random()*100), (int) (Math.random()*1000 + 1500));
            case 3: return new CShip((int) (Math.random()*11000 + 7000), (int) (Math.random()*80 + 150), (int) (Math.random()*20 + 2000), (int) (Math.random()*150), (int) (Math.random()*4000 + 2500));
            case 4: return new Amphibia((int) (Math.random()*100000 + 150000), (int) (Math.random()*150 + 150), (int) (Math.random()*6 + 2012), (int) (Math.random()*3000 + 1500), (int) (Math.random()*100));
            default: return null;
        }
    }
    public static CVehicle randVehicle(){
        return getVehicle((int) (Math.random()*5));
    }
    public static CVehicle[] getListVehicles(int n){
        CVehicle[] vehicles = new CVehicle[n];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i]=randVehicle();
        }
        return vehicles;
    }
    public static VehicleList GetSwimmable(VehicleList vehicles) {
        VehicleList whoSwims = new VehicleList();
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) instanceof SwimmAble)
                whoSwims.add(vehicles.get(i));
        }
        return whoSwims;
    }
    public static VehicleList GetRideable(VehicleList vehicles) {
        VehicleList whoRides = new VehicleList();
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) instanceof RideAble)
                whoRides.add(vehicles.get(i));
        }
        return whoRides;
    }
    public static VehicleList GetFlyable(VehicleList vehicles) {
        VehicleList whoFlies = new VehicleList();
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) instanceof FlyAble)
                whoFlies.add(vehicles.get(i));
        }
        return whoFlies;
    }
    public static int MaxSpeed(VehicleList vehicles) {
        int maxSpeed = vehicles.get(0).getSpeed();
        for (int i = 1; i < vehicles.size(); i++) {
            if (vehicles.get(i).getSpeed() > maxSpeed)
                maxSpeed = vehicles.get(i).getSpeed();
        }
        return maxSpeed;
    }
}