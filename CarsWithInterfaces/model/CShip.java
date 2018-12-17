package hw01.model;

import hw01.util.SwimmAble;

public class CShip extends CVehicle implements SwimmAble {
    private int passengers;
    private int port;

    public CShip(int price, int speed, int releaseYear, int passengers, int port) {
        setPrice(price);
        setSpeed(speed);
        setReleaseYear(releaseYear);
        this.passengers = passengers;
        this.port = port;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public int swim() {
        return 1;
    }

    @Override
    public String toString() {
        return "CShip{" +
                "passengers=" + passengers +
                ", port=" + port +
                ", " + super.toString();
    }
}