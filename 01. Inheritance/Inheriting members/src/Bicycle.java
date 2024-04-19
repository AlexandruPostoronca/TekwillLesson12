public class Bicycle {

    protected int cadence;
    private int gear;
    private int speed;

    protected int getSpeed() {
        return speed;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
