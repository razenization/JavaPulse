package hw01.model;

import hw01.util.FlyAble;

public class CPlane extends CVehicle implements FlyAble {
    private int passengers;
    private int latitude;

    public CPlane(int price, int speed, int releaseYear, int passengers, int latitude) {
        setPrice(price);
        setSpeed(speed);
        setReleaseYear(releaseYear);
        this.passengers = passengers;
        this.latitude = latitude;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public int fly() {
        return 1;
    }

    @Override
    public String toString() {
        return "CPlane{" +
                "passengers=" + passengers +
                ", latitude=" + latitude +
                ", " + super.toString();
    }
}
