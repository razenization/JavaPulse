package hw01.model;

import hw01.util.RideAble;

public class CCar extends CVehicle implements RideAble {
    public CCar() {

    }

    public CCar(int price, int speed, int releaseYear) {
        setPrice(price);
        setSpeed(speed);
        setReleaseYear(releaseYear);
    }

    @Override
    public int ride() {
        return 1;
    }

    @Override
    public String toString() {
        return "CCar{" + super.toString();
    }
}
