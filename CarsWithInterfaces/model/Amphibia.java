package hw01.model;

import hw01.util.RideAble;
import hw01.util.SwimmAble;

public class Amphibia extends CVehicle implements SwimmAble, RideAble {
    private int maxDepth;
    private int oxygenLevel;
    public Amphibia() {

    }

    public Amphibia(int price, int speed, int releaseYear, int maxDepth, int oxygenLevel) {
        setPrice(price);
        setSpeed(speed);
        setReleaseYear(releaseYear);
        this.maxDepth = maxDepth;
        this.oxygenLevel = oxygenLevel;
    }

    public int getDepth() {
        return maxDepth;
    }

    public void setDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    @Override
    public int ride() {
        return 1;
    }

    @Override
    public int swim() {
        return 1;
    }

    @Override
    public String toString() {
        return "Amphibia{" + super.toString();
    }
}