package hw01.model;

import hw01.util.FlyAble;
import hw01.util.RideAble;
import hw01.util.SwimmAble;

public class CBatMobile extends CVehicle implements SwimmAble, FlyAble, RideAble {
    private int ammo;
    public CBatMobile() {

    }

    public CBatMobile(int price, int speed, int releaseYear, int ammo) {
        setPrice(price);
        setSpeed(speed);
        setReleaseYear(releaseYear);
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    @Override
    public int fly() {
        return 1;
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
        return "CBatMobile{" + super.toString();
    }
}
