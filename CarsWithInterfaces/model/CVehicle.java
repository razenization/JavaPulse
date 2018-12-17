package hw01.model;

public abstract class CVehicle {
    private int price;
    private int speed;
    private int releaseYear;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "price=" + price +
                ", speed=" + speed +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
