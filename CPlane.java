package hw01;

public class CPlane extends CVehicle {
    private int passengers;
    private int latitude;

    public CPlane(int passengers, int latitude) {
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
    public String toString() {
        return "CPlane{" +
                "passengers=" + passengers +
                ", latitude=" + latitude +
                ", " + super.toString();
    }
}
