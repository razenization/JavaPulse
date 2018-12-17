package hw01.controller;

import hw01.model.CVehicle;

import java.util.Arrays;

public class VehicleList {

    private CVehicle[] vehicles;
    private int counter;

    public VehicleList() {
        vehicles = new CVehicle[3];
        counter = -1;
    }

    public void add(CVehicle vehicle) {
        if (counter == vehicles.length - 1) {
            vehicles = Arrays.copyOf(vehicles, vehicles.length * 2);
        }
        vehicles[++counter] = vehicle;
    }

    public CVehicle get(int i) {
        if (i < size())
            return vehicles[i];
        else return null;
    }

    public int size() {
        return counter + 1;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(vehicles[i]);
        }
    }

    public void update(int i, CVehicle vehicle) {
        if (i < size())
            vehicles[i] = vehicle;
    }

    @Override
    public String toString() {
        String out = "";
        for (CVehicle vehicle : vehicles) {
            if (vehicle != null)
                if (out.equals(""))
                    out = out + vehicle;
                else out = out + ", " + vehicle;
        }
        return out;
    }
}