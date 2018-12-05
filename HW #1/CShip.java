package hw01;

public class CShip extends CVehicle {
    private int passengers;
    private int port;

    public CShip(int passengers, int port) {
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
    public String toString() {
        return "CShip{" +
                "passengers=" + passengers +
                ", port=" + port +
                ", " + super.toString();
    }
}